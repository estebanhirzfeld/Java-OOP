import java.util.Arrays;

import javax.swing.JOptionPane;

import Account.Account;

public class Main {

  public static boolean checkNumber(String text) {
    boolean is_number = true;
    for (int i = 0; i < text.length(); i++) {
      if (!Character.isDigit(text.charAt(i))) {
        return false;
      }
    }
    return is_number;
  }

  public static double customInputDialog(String msg) {
    String input = "";
    boolean is_number = false;

    if (msg == null) {
      msg = "amount";
    }

    while (input.isEmpty() || !is_number) {
      input = JOptionPane.showInputDialog(null, msg);
      is_number = checkNumber(input);
    }

    return Double.parseDouble(input);
  }

  public static int customOptionsDialog(String[] options, String title, String msg) {
    if (title == null) {
      title = "Account App";
    }
    return JOptionPane.showOptionDialog(null, msg, "Account App - " + title, JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null, options, options[0]);
  }

  public static void customErrorDialog(String title, String msg) {
    if (title == null) {
      title = "Account App - Error";
    }
    JOptionPane.showMessageDialog(
        null,
        msg,
        "Account App - " + title,
        JOptionPane.ERROR_MESSAGE);
  }

  public static Account userSelectDialog(Account[] users, String title, String msg) {
    if (title == null) {
      title = "Account App";
    }
    return (Account) JOptionPane.showInputDialog(null, msg, "Account App - " + title, JOptionPane.INFORMATION_MESSAGE,
        null, users, users[0]);
  }

  public static String transfer_format_msg(Account user, double amount) {
    String msg = "";

    String selected_user = "";
    if (user != null) {
      selected_user = user.toString();
    }

    msg += "Usuario: " + selected_user + "\n";
    msg += "cantidad: " + amount + "\n";
    return msg;
  }

  private static Account[] filter_users(Account[] users, Account loggedUser) {
    return Arrays.stream(users)
        .filter(user -> !user.equals(loggedUser))
        .toArray(Account[]::new);
  }

  public static String menu_format_msg(Account user) {
    StringBuilder msg = new StringBuilder();

    if (user != null) {
      String selected_user = user.getFullName();

      msg.append("Bienvenido ").append(selected_user).append("!\n\n");
      msg.append("Balance: ").append(user.getBalance()).append("\n\n");

      String[] transactions = user.getTransactions();
      if (transactions.length > 0) {
        msg.append("Transacciones:\n");
        for (String transaction : transactions) {
          msg.append(transaction).append("\n");
        }
      } else {
        msg.append("Aún no hay Transacciones.\n");
      }
    } else {
      msg.append("No user selected.\n");
    }

    return msg.toString();
  }

  public static void main(String[] args) {
    String[] menu_options = { "Transferir Dinero", "Retirar Dinero", "Ingresar Dinero", "Cambiar de Cuenta" };
    String[] transfer_options = { "Seleccionar Usuario", "Ingresar Monto", "Transferir", "Cancelar" };

    int option;
    Account user = new Account("Tony Montana", 100, "tony@montana.com");
    Account user_2 = new Account("John Locke", 0, "john@locke.com");
    double amount = 0;

    Account[] users = { user, user_2 };

    boolean exit_menu = false;
    while (!exit_menu) {
      Account logged_user = userSelectDialog(users, "Iniciar Sesion", "Seleccionar Cuenta");
      if (logged_user == null) {
        exit_menu = true;
      }

      boolean exit_account = false;
      while (!exit_account) {
        option = customOptionsDialog(menu_options, "Tu Cuenta", menu_format_msg(logged_user));
        switch (menu_options[option]) {
          case "Ingresar Dinero":
            amount = customInputDialog(null);
            logged_user.deposit(amount);
            amount = 0;
            break;
          case "Retirar Dinero":
            amount = customInputDialog(null);
            logged_user.withdraw(amount);
            amount = 0;
            break;
          case "Transferir Dinero":
            boolean exit_transfer = false;
            int transfer_option;
            Account transfer_user = null;
            double transfer_amount = 0;

            while (!exit_transfer) {
              transfer_option = customOptionsDialog(transfer_options, "Transferir",
                  transfer_format_msg(transfer_user, transfer_amount));

              switch (transfer_options[transfer_option]) {
                case "Seleccionar Usuario":
                  Account[] filteredUsers = filter_users(users, logged_user);
                  transfer_user = userSelectDialog(filteredUsers, "Busqueda Usuarios", "usuario:");

                  break;
                case "Ingresar Monto":
                  transfer_amount = customInputDialog("cantidad: MAX ( " + logged_user.getBalance() + " )");
                  break;
                case "Transferir":
                  if (transfer_user != null && transfer_amount > 0) {
                    assert logged_user != null;
                    logged_user.transfer(transfer_amount, transfer_user);
                  } else {
                    customErrorDialog(null, "Usuario Seleccionado o Cant Ingresada, Inválidos");
                  }
                  exit_transfer = true;
                  break;
                case "Cancelar":
                  exit_transfer = true;
                  break;
              }
            }
            break;
          case "Cambiar de Cuenta":
            exit_account = true;
            break;
        }
      }
    }
  }
}
