package com.bottomfeeder.helloworld.model;

public class Account {
    int balance = 20;

    public boolean withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Balance too low");
            return false;
        }
        balance = balance - amount;
        System.out.println("Balance is OK");
        return true;
    }

    public String message() {
        return "hello world";
    }
}
