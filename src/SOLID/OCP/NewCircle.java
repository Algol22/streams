package SOLID.OCP;

public class NewCircle implements Shape {
    private double radius;

    public NewCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}