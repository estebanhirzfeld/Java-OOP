package Account;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Account {

    private double balance;
    private String email;
    private String full_name;
    private String[] transactions = new String[10];
    private int transaction_count;

    public Account(String full_name, double balance, String email) {
        this.full_name = full_name;
        this.balance = balance;
        this.email = email;
    }

    // Getters & Setters

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    private void setBalance(double balance) {
        if (balance < 0) {
            balance = 0;
        }
        this.balance = balance;
    }

    public String getFullName() {
        return full_name;
    }

    public String[] getTransactions() {
        return Arrays.copyOf(transactions, transaction_count);
    }

    // Class Methods

    private void record_transaction(String type, double amount, double balance_before, double balance_after,
            String user) {
        if (transaction_count >= transactions.length) {
            transactions = Arrays.copyOf(transactions, transactions.length * 2);
        }

        String transaction_record;

        if (user != null && !user.isEmpty()) {
            transaction_record = String.format(
                    "%s | %s | %.2f | %.2f",
                    type,
                    user,
                    amount,
                    balance_after);
        } else {
            transaction_record = String.format(
                    "%s | %.2f | %.2f | %.2f",
                    type,
                    amount,
                    balance_before,
                    balance_after);
        }

        transactions[transaction_count++] = transaction_record;
    }

    public boolean has_founds(double amount) {
        return this.balance >= amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            double balance_before = this.balance;
            this.setBalance(this.balance + amount);
            record_transaction("Deposito", amount, balance_before, this.getBalance(), null);
        } else {
            JOptionPane.showMessageDialog(null, "Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.has_founds(amount)) {
                double balance_before = this.balance;
                this.setBalance(this.balance - amount);
                record_transaction("Extracción", -amount, balance_before, this.getBalance(), null);
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient Funds");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Withdrawal amount must be positive");
        }
    }

    public void transfer(double amount, Account receiver) {
        if (this.equals(receiver)) {
            JOptionPane.showMessageDialog(null, "Cannot transfer funds to the same account.");
            return;
        }

        if (amount > 0) {
            if (has_founds(amount)) {
                double balance_before_sender = this.balance;
                double balance_before_receiver = receiver.getBalance();

                this.setBalance(this.balance - amount);
                receiver.setBalance(receiver.getBalance() + amount);

                record_transaction("Transferencia", -amount, balance_before_sender, this.getBalance(), receiver.getEmail() );
                receiver.record_transaction("Transferencia", amount, balance_before_receiver, receiver.getBalance(), this.getEmail() );
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient Funds");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Transfer amount must be positive");
        }
    }

    @Override
    public String toString() {
        return email;
    }
}
