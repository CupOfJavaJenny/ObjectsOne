public class Dog {

    //Defined class dog

    //instance variables size, color, weight( include data types)
    private String size;
    private String color;
    private int weight;


    //constructor: "blueprint",meant to declare/ initialize Object Dog properties.
    // Includes parameters with data types & properties
    public Dog(String size, String color, int weight) {
        this.size = size;
        this.color = color;
        this.weight = weight;
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

}