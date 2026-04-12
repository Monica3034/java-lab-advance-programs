public class main{
    public static void main(String[]args){
        Animal obj=new Dog();
        obj.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

or

public class Main {
    public static void main(String[] args) {
        Vehicle obj = new Bike();  // Parent reference, child object
        obj.sound();               // Runtime polymorphism
    }
}

class Vehicle {
    void sound() {
        System.out.println("Vehicle makes sound");
    }
}

class Bike extends Vehicle {
    @Override
    void sound() {
        System.out.println("Bike makes sound");
    }
}
