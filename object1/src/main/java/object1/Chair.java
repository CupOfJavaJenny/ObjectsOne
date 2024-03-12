package object1;

public class Chair {
    // my instance variables:color, size & legs.
    private String color;
    private String size;
    private int legs;

    //constructor variable initializing my fields
    public Chair(String color, String size, int legs) {
        this.color = color;
        this.size = size;
        this.legs = legs;

    }
//my getters& setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(String size) {
        this.legs = legs;
    }

}

