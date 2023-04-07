package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw(); // Output: Drawing a circle...
        rectangle.draw(); // Output: Drawing a rectangle...
    }
}
//In this example, the Shape class defines a draw() method, which is overridden
//        in the Circle and Rectangle classes. When we create a
//        new Circle or Rectangle object and call the draw() method,
//        the appropriate method for the object's class is called.
