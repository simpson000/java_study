package javaBasic;

public class Accountmain {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.deposit(10000);
        account1.withdraw(5000);
        account1.withdraw(6000);
    }
}
