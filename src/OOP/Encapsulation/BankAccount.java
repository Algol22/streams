package OOP.Encapsulation;

//In this example, the BankAccount class has a private
//field balance, which is not directly accessible from
//        outside the class. Instead, the class provides
//        public methods deposit(), withdraw(),
//        and getBalance() for modifying and accessing the balance, respectively.



public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(200);

        System.out.println(bankAccount.getBalance());


    }

}

