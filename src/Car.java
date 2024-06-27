public class Car {

    // fields of the class or attribute
    String color = "Red";
    int tankCapacity;
    String name;
    int speed;
    boolean forSale;

// object is an instance ofr a class and class is a definition

    // getter for color
    public String getColor() {
        return color;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    //setter for speed
    public void setSpeed(int speed) {
        this.speed  = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {

    }

    public Car(String color, int tankCapacity, String name, int speed) {
        this.color = color;
        this.tankCapacity = tankCapacity;
        this.name = name;
        this.speed = speed;
    }

    public Car(String color, int tankCapacity, String name) {
        this.color = color;
        this.tankCapacity = tankCapacity;
        this.name = name;
    }

    // class can have some methods
    public void reFuel() {

    }

    public void park() {

    }

    public void drive() {

    }

    public void stop() {

    }

}
