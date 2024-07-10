package Synchronization;

public class BankWithdrawalImpl {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        BankWithdrawal bankWithdrawal = new BankWithdrawal(account, 1000);

        BankWithdrawal bankWithdrawal1 = new BankWithdrawal(account, 1500);

        Thread thread1 = new Thread(bankWithdrawal);
        Thread thread2 = new Thread(bankWithdrawal1);


        thread1.start();
        thread2.start();


    }
}
