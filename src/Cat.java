public class Cat extends Animal{
    private String color = "Black-Brown";
    private int age = 5;
    private boolean isMale = false;
    public String tail = "cat tail";

    public Cat(String color, int age, boolean isMale) {
        this.color = color;
        this.age = age;
        this.isMale = isMale;
    }

    public void eat() {
        String tail1 = super.tail;
        System.out.println(tail1);
        //System.out.println("Cat is eating");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow...Meow.....");
    }

    @Override
    public void race() {
        System.out.println("Cat is racing....");
    }
}
