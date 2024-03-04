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
//
//
//    }


    public static void main(String... args) {
//        Logger logger=Logger.getLogger(Main.class.getName());
//        logger.info("This is a module-using Hello World!");
//        System.out.println("Hi Asan");

        Person john = new Person();
        System.out.println(john.getName());

        Person jenn = new Person(100+55, "smith");
        System.out.println(jenn.getName());
        System.out.println(jenn.getHeight());

        Car honda = new Car();

        




    }

//    private boolean getName() {
//    }
//}
}