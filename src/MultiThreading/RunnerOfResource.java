package MultiThreading;

public class RunnerOfResource {
    public static void main(String[] args) {
        Resource resource = new Resource(2);

        ResourceThreadMaker resourceThreadMaker = new ResourceThreadMaker(resource);
        ResourceThreadMaker resourceThreadMaker1 = new ResourceThreadMaker(resource);
        ResourceThreadMaker resourceThreadMaker2 = new ResourceThreadMaker(resource);

        Thread thread = new Thread(resourceThreadMaker);
        Thread thread1 = new Thread(resourceThreadMaker1);
        Thread thread2 = new Thread(resourceThreadMaker2);

        thread1.start();
        thread2.start();
        thread.start();

    }
}
