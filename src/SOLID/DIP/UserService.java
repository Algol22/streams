package SOLID.DIP;

//Dependency Inversion Principle (DIP)
//        The DIP states that high-level modules should not depend on low-level modules.
//        Both should depend on abstractions.
//
//        Example:
//In the example above, the high-level UserServiceImpl class depends on the UserRepository
//interface instead of the concrete implementation.
//        This way, we can easily swap the concrete implementation of the UserRepository
//interface without affecting the UserServiceImpl class.

public interface UserService {
    void createUser(User user);
}