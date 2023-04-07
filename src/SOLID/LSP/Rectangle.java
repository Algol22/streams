package SOLID.LSP;

//Now we can add new shapes without modifying the AreaCalculator class.
//
//        3. Liskov Substitution Principle (LSP)
//
//        The LSP states that if a class is a subtype of another class,
//        it should be able to substitute for that class without affecting
//        the correctness of the program.
//In the example above, the Square class extends the Rectangle class
//and overrides its setWidth() and setHeight() methods. However,
//        if we pass a Square object to the calculateArea() method,
//        it will return an incorrect area. To adhere to the LSP, we
//        can remove the inheritance relationship between the Rectangle and
//        Square classes and create a new interface for both classes to implement.



public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
