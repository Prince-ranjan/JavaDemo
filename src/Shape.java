public interface Shape{
    // three types of method we can define in an interface
    // i. normal public method :- these methods need to be overridden byu all the classes that implements this interface


    public double area();

    public double perimeter();

    // default method :- we have the choice if we want to override it we can override it. if we don't want to override we will not oiverride
    // default function came in interface in the release of java 8

    default void printShape() {
        System.out.println("Printing any shape");
    }

    // static

    public static void doNothing() {
        System.out.println("This is a static method inside a interface");
    }
}
