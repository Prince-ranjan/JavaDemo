public abstract class Animal {

    public void eat() {
        System.out.println("Animal is eating.....");
    }

    public abstract void makeSound();

    public abstract void race();

    private void doNothing() {
        System.out.println("This is doing nothing...");
    }
}
