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

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter(); //value = 0
        CounterCaller cc = new CounterCaller(c);
        Thread t1 = new Thread(cc); // value = 0
        Thread t2 = new Thread(cc); // value = 0


        t1.start(); // value = 5
        t2.start();

//        t2.wait();

    }
}
