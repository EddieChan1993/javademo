package ch13.ch1;

/**
 * Created by Administrator on 2017-11-16.
 */
public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public  void withdraw(int amount) {
        balance = balance - amount;
    }
}