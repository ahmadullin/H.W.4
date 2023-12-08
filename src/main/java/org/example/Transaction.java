package org.example;

public class Transaction {
    // Метод для выполнения транзакции (перевода средств)
    public static void transfer(Account sourceAccount, Account destinationAccount, double amount) {
        try {
            sourceAccount.transfer(destinationAccount, amount);
            System.out.println("Транзакция успешно выполнена");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}