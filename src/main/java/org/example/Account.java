package org.example;

public class Account {
    private int balance;
    private String currency;
    public static final String DEFAULT_CURRENCY = "PLN";

    public Account() {
        this.balance = 0;
        this.currency = DEFAULT_CURRENCY;
    }

    public Account(int balance) {
       this.balance = balance;
       this.currency = DEFAULT_CURRENCY;
    }

    public boolean deposit(int amount) {
        if(amount <= 1000) {
            balance += amount;
            return true;
        } else {
            System.out.println("Sorry byczku, wypierdalaj do oddziału.");
            return false;
        }
    }

    public boolean withdraw(int amount) {
        if(amount == 0) {
            System.out.println("Jestes glupi");
            return true;
        }
        if(amount < 0) {
            System.out.println("Wypierdalaj zlodzieju jebany do pracy");
            return false;
        }

        if(balance < amount) {
            System.out.println("Sorry byczku, masz tylko " + getBalance());
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public void print() {
        System.out.println("Saldo wynosi " + getBalance());
    }

    private void sprawdzimyCzyMnieWidac() {}

    public String getBalance() {
        return this.balance + " " + getCurrency();
    }

    public String getCurrency() {
        return this.currency;
    }
}
