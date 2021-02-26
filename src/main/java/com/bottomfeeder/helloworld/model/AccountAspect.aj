package com.bottomfeeder.helloworld.model;

public aspect AccountAspect {
    final int MIN_BALANCE = 10;

    pointcut callWithDraw(int amount, Account acc):
            call(boolean Account.withdraw(int)) && args(amount) && target(acc);

    before(int amount, Account acc): callWithDraw(amount, acc) {
        System.out.println("Aspect Before");
    }

    boolean around(int amount, Account acc): callWithDraw(amount, acc) {
        if (acc.balance < amount) {
            System.out.println("Balance and amount" + acc.balance + ", " + amount);
            return false;
        }
        System.out.println("We're all good");
        return proceed(amount, acc);
    }

    after(int amount, Account balance): callWithDraw(amount, balance) {
    }
}
