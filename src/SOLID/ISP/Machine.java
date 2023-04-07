package SOLID.ISP;

//4. Interface Segregation Principle (ISP)
//
//        The ISP states that clients should not be forced to depend on methods they do not use.
//
//        Example:
//In the example above, the Machine interface has three methods: print(), scan(), and fax().
//        The MultiFunctionMachine class implements all three methods, while
//        the Printer and Scanner classes implement only the methods they need.
//        This way, clients that only need to print can use the Printer class without
//        having to depend on scan() and fax() methods.

public interface Machine {
    void print();
    void scan();
    void fax();
}
