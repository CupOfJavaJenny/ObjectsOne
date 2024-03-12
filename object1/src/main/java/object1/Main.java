package object1;

import java.util.logging.Logger;
public class Main {
//public class Person {
//    public Person(int height){
//        this.height = height;
//    };
//
//    public static void main(){
//        //Declare and initialize an object
//        Person person1 = new Person(0);
//        //Now you can use Object 'person1' //
//    }

//means that the method is accessible anywhere, including from outside the class it's declared in.
// static: By using 'static', we're saying that the main method can be run without needing an instance of the class.
// void: This keyword indicates that the main method doesn't return any value.


    public static void main(String... args) {
//        Logger logger=Logger.getLogger(Main.class.getName());
//        logger.info("This is a module-using Hello World!");
//        System.out.println("Hi Asan");

        Person john = new Person();
        System.out.println(john.getName());

        Person john1 = new Person(97, "raz");
        System.out.println(john1.getName());
        System.out.println(john1.getHeight());


    Car honda = new Car("honda",4, "four cylinder",4);
    Dog mugen = new Dog( "medium", "black", 60);


    mugen.smile();
    mugen.heavyDog(50);
    mugen.bark();
    mugen.walk();
    Dog balto = new Dog("purple");
    System.out.println(balto.getColor());

    Chair rocking = new Chair( "brown", "big", 2);
    Chair inflatable = new Chair("gray", "small", 1);


    }

}