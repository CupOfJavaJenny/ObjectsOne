package object1;

public class Car {
   //Defined class car

   //instance variables make, doors, wheels, engine( include data types)
   private String make;
   private int doors;
   private int wheels;
   private String engine;


   //constructor: "blueprint",meant to declare/ initialize Object Car properties.
   // Includes parameters with data types & properties
   public Car(String make, int doors, String engine, int wheels) {
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
      this.doors = doors;
   }

   public String getEngine() {
      return engine;
   }

   public void setEngine(String engine) {
      this.engine = engine;
   }

   public int getWheels() {
      return wheels;
   }

   public void setWheels(int wheels) {
      this.wheels = wheels;

   }


}
