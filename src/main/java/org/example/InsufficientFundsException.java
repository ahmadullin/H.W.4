package org.example;

// Создаем класс InsufficientFundsException, наследуемый от Exception
public class InsufficientFundsException extends RuntimeException {
    private double balance;

    // Конструктор класса InsufficientFundsException
    public InsufficientFundsException(double balance) {
        super("Недостаточно средств на счете, текущий баланс: " + balance);
        this.balance = balance;
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }
}
