package MultiThreading;

public class ThreadApplication {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());

        Thread t2 = new Thread(new MyRunnable());

//        MyThread t11 = new MyThread();
//        MyThread t2 = new MyThread();
//        MyThread t3 = new MyThread();
////
        t1.start();
        t2.start();
//        t3.start();
    }
}
