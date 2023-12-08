package org.example;
// Пример использования программы
public class Main {
    public static void main(String[] args) {
        try {
            // Создаем счета
            Account account1 = new DebitAccount(1000);
            Account account2 = new CreditAccount(500, 2000);

            // Выводим начальные балансы
            System.out.println("Баланс счета 1: " + account1.getBalance());
            System.out.println("Баланс счета 2: " + account2.getBalance());

            // Проводим транзакции
            Transaction.transfer(account1, account2, 800);
            Transaction.transfer(account2, account1, 1200);

            // Выводим конечные балансы
            System.out.println("Баланс счета 1: " + account1.getBalance());
            System.out.println("Баланс счета 2: " + account2.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}