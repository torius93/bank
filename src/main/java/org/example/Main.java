package org.example;

import static org.example.Main.Operation.DEPOSIT;
import static org.example.Main.Operation.WITHDRAW;

public class Main {
    public enum Operation {
        DEPOSIT, WITHDRAW;
    }

    public static void main(String[] args) {
        Account account = new Account(1000);
        performDeposit(account, 100);
        performDeposit(account, 1001);
        performWithdraw(account, -1231231);
        performWithdraw(account, 100);
        performWithdraw(account, 1100);
    }

    public static void performDeposit(Account account, Integer amount) {
       performOperation(account, amount, DEPOSIT);
    }

    public static void performWithdraw(Account account, Integer amount) {
        performOperation(account, amount, WITHDRAW);
    }

    private static void performOperation(Account account, Integer amount, Operation operation) {
        Integer prowizja = 1;
        amount =- prowizja;

        account.print();
        System.out.println("Próbuję " + operation + " " + amount + " " + account.getCurrency());
        boolean result = false;
        if(DEPOSIT.equals(operation)) {
            result = account.deposit(amount);
        }
        if(WITHDRAW.equals(operation)) {
            result = account.withdraw(amount);
        }

        if(result) {
            System.out.println("operacja " + operation + " sie udala");
        } else {
            System.out.println("operacja sie nie udala, sprawdz logi");
        }

        account.print();
    }
}