package object1;

public class Car {
   //Defined class car

   //instance variables make, mode, year, and mileage( include data types)
   private String make;
   private int  doors;
   private int wheels;
   private String engine;


   //constructor: "blueprint",meant to declare/ initialize Object Car properties.
   // Includes parameters with data types & properties
   public Car(String make, int wheels, String engine, int doors) {
      this.make = make;
      this.doors;
      this.wheels;
      this.engine;
   }
   //set getters and setters because private class
   //setters requires parameters with data type, not getters. Initialize using 'this'
   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getMileage() {
      return mileage;
   }

   public void setMileage(int mileage) {
      this.mileage = mileage;
   }



public void setColor( String color){
   this.color = color;
}

public String getColor(){
      return this.color;



}

}
