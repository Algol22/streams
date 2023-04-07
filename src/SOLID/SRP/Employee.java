//Single Responsibility Principle (SRP)
//        The SRP states that a class should have only one reason to change.
//        This means that a class should have only one responsibility or job.
//
//        Example:

//In the example above, the Employee class has two responsibilities:
// storing employee data and calculating taxes.
// To adhere to the SRP, we can separate these responsibilities into two classes:
// Employee and TaxCalculator.

package SOLID.SRP;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateTax() {
        return salary * 0.2;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
