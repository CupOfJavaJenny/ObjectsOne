package object1;

public class Main {

    public static void main(String... args) {

        Person person1 = new Person("raz", 50, 97);
        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        Car honda = new Car("honda", 4, "four cylinder", 4);
        Dog mugen = new Dog("medium", "black", 60);

        mugen.smile();
        mugen.heavyDog(50);
        mugen.bark();
        mugen.walk();
        Dog balto = new Dog("purple");
        System.out.println(balto.getColor());

        Chair rocking = new Chair("brown", "big", 2);
        Chair inflatable = new Chair("gray", "small", 1);

    }

}
