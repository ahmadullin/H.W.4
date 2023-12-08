package org.example;

public class Account {
    private double balance; // баланс на счете

    // Конструктор класса Account
    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Отрицательный начальный баланс");
        }
        this.balance = balance;
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для выполнения депозита
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Отрицательная сумма депозита");
        }
        balance += amount;
    }

    // Метод для выполнения снятия средств
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException(balance);
        }
        balance -= amount;
    }

    // Метод для перевода средств на другой счет
    public void transfer(Account destinationAccount, double amount) {
        withdraw(amount);
        destinationAccount.deposit(amount);
    }
}

