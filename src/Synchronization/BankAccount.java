package Synchronization;

public class BankAccount {
    private int balance;  // 5000

    public BankAccount(int balance) {  // 3000 3000
        this.balance = balance;
    }

    public  synchronized void withdrawal(int amount) {
        if(balance >= amount) {
            balance -= amount;

            System.out.println(Thread.currentThread().getName() + " has withdrawn balance of amount = " + amount);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " balance is low !");
        }
    }

    public int getBalance() {
        return balance;
    }

}
