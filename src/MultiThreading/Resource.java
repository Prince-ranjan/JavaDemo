package MultiThreading;

import java.util.concurrent.Semaphore;

public class Resource {
    private final Semaphore semaphore;

    public Resource(int permit) {
        semaphore = new Semaphore(permit);
    }

    public void resourceMethod(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " has acquired the permit");
            Thread.sleep(7000);
            System.out.println(Thread.currentThread().getName() + " has released the permit");
            semaphore.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
