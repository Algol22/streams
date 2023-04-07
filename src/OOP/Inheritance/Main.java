package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move(); // Output: Moving...
        dog.bark(); // Output: Barking...
    }
}
//In this example, the Dog class inherits the move()
//        method from the Animal class, and adds a new bark() method.