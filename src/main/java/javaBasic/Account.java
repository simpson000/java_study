package javaBasic;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit amount : " + amount);
    }
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw amount : " + amount);
        }
    }

}
