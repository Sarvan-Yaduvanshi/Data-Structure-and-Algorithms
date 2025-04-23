package Object_Oriented_Programming;
public class Inheritance {
    public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    }
}
// Base Class OR super class(parent)
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}

// Derived class OR Sub class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swim in water");
    }
}
