package SOLID.ISP;

public class Printer implements Machine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        // Not implemented
    }

    public void fax() {
        // Not implemented
    }
}
