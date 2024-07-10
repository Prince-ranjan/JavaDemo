package Synchronization;

public class CounterCaller implements Runnable{
    public CounterCaller(Counter counter) {
        this.counter = counter;
    }

    Counter counter = new Counter();
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() +" value = " +counter.getValue());
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        CounterCaller cc = new CounterCaller(c);
        Thread t1 = new Thread(cc);
        Thread t2 = new Thread(cc);

        t1.start();
        t2.start();
    }
}
