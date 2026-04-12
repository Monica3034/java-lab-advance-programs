class Animal {
    String name = "Generic Animal";

    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    // Constructor
    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
    
    void displayName() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
    }
}

public class Main {
    public static void main(String[] name) {
        Dog dog = new Dog();
        dog.displayName();
        dog.sound();
    }
}
    
