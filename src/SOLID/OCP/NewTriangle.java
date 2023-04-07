package SOLID.OCP;

public class NewTriangle implements Shape {
    private double base;
    private double height;

    public NewTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}