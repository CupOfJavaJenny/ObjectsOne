package object1;

class Person {

    String name;
    int age = 0;
    int height = 0;//inches

    public Person() {
    }

    //Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = 0;//centimeters
    }

    //Getter
    public String getName() {
        return this.name;

    }

    //Setter
    public void setName(String name) {
        this.name = name;

    }

    //Getter
    public int getAge() {
        return this.age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;

    }

    //Getter
    public int getHeight() {
        return this.height;
    }

    //Setter
    public void setHeight(int height) {
        this.height = height;
    }

}
