
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Main {

    public static boolean checkNumber(String text) {
        boolean is_number = true;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                is_number = false;
                return is_number;
            }
        }
        return is_number;
    }

    public static int customInput(String text) {
        String input = "";
        boolean is_number = false;

        while (input.length() <= 0 || !is_number) {
            input = JOptionPane.showInputDialog("Ingrese " + text);
            is_number = checkNumber(input);
        }
        int number = Integer.parseInt(input);
        return Math.abs(number);
    }

    public static void main(String[] args) {

        int day = customInput("Dia de Nacimiento.");
        int month = customInput("Mes de Nacimiento.");
        int year = customInput("Año de Nacimiento.");

        LocalDate birth_date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        if (birth_date.isBefore(now)) {
            Period comparision = Period.between(birth_date, now);
            JOptionPane.showMessageDialog(null, "Edad: " + comparision.getYears());
        }

    }
}
