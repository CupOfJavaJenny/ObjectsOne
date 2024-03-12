package object1;

public class Dog {

    //Defined class dog
    //instance variables size, color, weight( include data types)
    private String size;
    private String color;
    private int weight;

    //constructor: "blueprint",meant to declare/ initialize Object object1.Dog properties.
    // Includes parameters with data types & properties
    public Dog(String size, String color, int weight) {
        this.size = size;
        this.color = color;
        this.weight = weight;
    }
    public Dog(){
        this.color = "brown";

    }
    //bottom constructor helps us give the user options to type in a preferred color
    public Dog(String color){

        this.color = color;
    }
    //set getters and setters because private class
    //setters requires parameters with data type, not getters. Initialize using 'this'
    public String getSize() {

        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getColor() {

        return color;
    }
    public void setColor(){

        this.color = color;
    }

    public void heavyDog(int pounds){
        if(pounds > 10 ){
            System.out.println("getting big!");
        }if(pounds <= 10){
            System.out.println("eat more!");
        }
    }
    public void bark(){
        System.out.println("Woof!");
    }
    public void smile(){
        System.out.println("Wag that tail!");
    }

    public void walk(){ System.out.println("leash!");

}
}