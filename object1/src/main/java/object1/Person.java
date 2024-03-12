package object1;

public class Person {
// I defined a class

    //Start instance variables
    private int height;
    String name = "John";
//defining instance variable in centimeters

    //start constructor/ initialize object Person   using 'this'
    public Person() {

        this.height = 0;
    }

    public Person(int height, String name) {
        this.height = height;
        this.name = name;
    }

    //getters tell what the program to do
    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }
}


