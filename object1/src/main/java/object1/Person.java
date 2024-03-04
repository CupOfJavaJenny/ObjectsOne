package object1;

public class Person {
// I defined a class

int height;
String name = "John";
//defining instance variable in centimeters
public Person(){
    this.height = 0;
}
public Person (int height, String name){
    this.height = height;
    this.name = name;
}
    public String getName(){
    return name;
    }
    public int getHeight(){
    return height;
    }
}
