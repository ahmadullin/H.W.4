package org.example;

public class CreditAccount extends Account {
    private double creditLimit; // кредитный лимит

    // Конструктор класс CreditAccount
    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    // Переопределяем метод для выполнения снятия средств
    @Override
    public void withdraw(double amount) {
        if (amount > (getBalance() + creditLimit)) {
            throw new InsufficientFundsException(getBalance());
        }
        super.withdraw(amount);
    }
}

