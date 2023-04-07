package SOLID.LSP;

public class NewAreaCalculator {
    public static void main(String[] args) {
        Shape rectangle = new NewRectangle(5, 10);
        Shape square = new NewSquare(5);
        NewcalculateArea(rectangle); // Output: 50.0
        NewcalculateArea(square); // Output: 25.0
    }

    public static void NewcalculateArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}
