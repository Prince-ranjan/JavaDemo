public class Dog extends Animal{

    private String breed = "Husky";
    private String color = "Black-Brown";
    private int age = 5;
    private boolean isMale = false;
    private int price;
    // constructor helps us in creating instance of an object

    // this is default constructor
    public Dog() {
    }

    // parameterised constructor
    public Dog(String breed, String color, int aget, boolean isMale) {
        age = aget;
        this.color = color;
        this.breed = breed;
        this.isMale = isMale;
    }

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    // when out fields are private  we define getters and those getters are public


    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    // setters will always be public will have void return type but it will take value as argument

// GET, POST
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    // methods
    public void bark() {
        System.out.println("Woof Woof ....!");
    }

    public void run() {
        System.out.println("Run doggy Run ... !");
    }


    @Override
    public void makeSound() {
        System.out.println("Woof Woof ....!");
    }

    @Override
    public void race() {
        System.out.println("Dog is racing...");
    }
}
