package Test;

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Explicit call to the superclass constructor
        System.out.println("Dog constructor");
    }
}
