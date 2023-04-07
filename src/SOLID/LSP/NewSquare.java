package SOLID.LSP;

public class NewSquare implements Shape {
    private double side;

    public NewSquare(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
