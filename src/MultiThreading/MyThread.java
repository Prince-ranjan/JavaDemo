package MultiThreading;

public class MyThread extends Thread{
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " value = " + i);
            // t1 value = 0
            // t2 value = 0
            // t2 value = 1
            // t3 value = 0
        }
    }
}
