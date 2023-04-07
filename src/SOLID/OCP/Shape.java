package SOLID.OCP;
//
//Open/Closed Principle (OCP)
//        The OCP states that a class should be open for extension but closed for modification.
//        This means that we should be able to add new functionality to a class without changing its existing code.
//
//        In the example, the AreaCalculator class calculates the total area of all the shapes passed to it.
//        If we want to add a new shape, we need to modify the AreaCalculator class.
//        To adhere to the OCP, we can create a new class for each shape and implement the Shape interface.
//        Example:
//Now we can add new shapes without modifying the AreaCalculator class.


public interface Shape {
    double getArea();
}
