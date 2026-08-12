
abstract class Bank {

    // Abstract method
    abstract void withdraw(int amount);

    // Normal method
    void welcome() {
        System.out.println("Welcome to the Bank");
    }

    // Normal method
    void checkBalance() {
        System.out.println("Checking account balance...");
    }
}

class SBI extends Bank {

    int balance = 50000;

    // Providing implementation for abstract method
    void withdraw(int amount) {

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn : " + amount);
            System.out.println("Remaining balance : " + balance);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }
}

class HDFC extends Bank {

    int balance = 80000;

    void withdraw(int amount) {

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn : " + amount);
            System.out.println("Remaining balance : " + balance);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }
}

public class abs {

    public static void main(String[] args) {

        SBI s = new SBI();

        s.welcome();
        s.checkBalance();
        s.withdraw(10000);

        System.out.println();

        HDFC h = new HDFC();

        h.welcome();
        h.checkBalance();
        h.withdraw(20000);
    }
}