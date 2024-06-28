public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //System.out.println(dog.getBreed() + " " + dog.getColor() + " " + dog.getAge() + " " + dog.isMale());

        Dog dog1 = new Dog("German Shephard" , 1);
        //System.out.println(dog1.getBreed() + " " + dog1.getColor() + " " + dog1.getAge() + " " + dog1.isMale());

        Dog dog2 = new Dog("Labarador", "Silver", 2, false);
       // System.out.println(dog2.getBreed() + " " + dog2.getColor() + " " + dog2.getAge() + " " + dog2.isMale());
        dog2.setAge(3);

       // System.out.println(dog2.getBreed() + " " + dog2.getColor() + " " + dog2.getAge() + " " + dog2.isMale());
//
//        dog.bark();
//
//        dog1.bark();
//
//        dog2.run();

        dog1.eat();


        Cat cat = new Cat("White", 2, false);
        cat.eat();
        cat.makeSound();
        cat.race();;

        Cow cow = new Cow();

        cow.makeSound();
        cow.eat();
        cow.race();


//       Car car1 = new Car();
//        System.out.println(car1.getColor());  //red
//        System.out.println(car1.getName()); // null
//        car1.setName("Audi");
//        System.out.println(car1.getName()); //audi
//       Car car2 = new Car("Black", 55,"Lord Alto");
//        System.out.println(car2.getColor());
//       Car car3 = new Car("Silver", 100, "BMW", 200);
//        System.out.println(car3.getColor());



    }




}

