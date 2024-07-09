package MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " value = " + i);
            try {
                Thread.sleep(2500);
            }
            catch (Exception e) {
                System.out.println("Caught an exception");
            }
        }
    }
}
