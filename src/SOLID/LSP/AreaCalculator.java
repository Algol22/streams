package SOLID.LSP;

public class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);
        calculateArea(rectangle); // Output: 50.0
        calculateArea(square); // Output: 25.0
    }

    public static void calculateArea(Rectangle rectangle) {
        System.out.println(rectangle.getArea());
    }
}