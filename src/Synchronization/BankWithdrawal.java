package Synchronization;

public class BankWithdrawal implements Runnable{

    private BankAccount account;

    private int amount;

    public BankWithdrawal(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            account.withdrawal(amount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
