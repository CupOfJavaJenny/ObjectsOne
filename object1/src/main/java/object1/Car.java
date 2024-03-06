package object1;

public class Car {
   //Defined class car

   //instance variables make, doors, wheels, engine( include data types)
   private String make;
   private int  doors;
   private int wheels;
   private String engine;


   //constructor: "blueprint",meant to declare/ initialize Object Car properties.
   // Includes parameters with data types & properties
   public Car(String make, int wheels, String engine, int doors) {
      this.make = make;
      this.doors = doors;
      this.wheels = wheels;
      this.engine = engine;
   }
   //set getters and setters because private class
   //setters requires parameters with data type, not getters. Initialize using 'this'
   public String getMake() {

      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }
public int getDoors() {
      return doors;
}
   public void setDoors(int doors) {

      this.doors;
   }

   public int getEngine() {
      return engine;
   }
   public void set(String engine) {
      this.engine;
   }


   public int getWheels() {

      return wheels;
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
