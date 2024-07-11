package MultiThreading;

public class ResourceThreadMaker implements Runnable{

    private Resource resource;

    public ResourceThreadMaker(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 0; i < 4; i++) {
            resource.resourceMethod();
        }
   }
}
