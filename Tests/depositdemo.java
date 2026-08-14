package Tests;

class DepositAccount {

    private double balance;

  
    DepositAccount(double balance) {
        this.balance = balance;
    }

  
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } 
        else {
            balance = balance + amount;
        }
    }


    public double getBalance() {
        return balance;
    }
}

public class depositdemo {

    public static void main(String[] args) {

        DepositAccount account = new DepositAccount(25000);

        System.out.println("Initial Balance: Rs." + account.getBalance());

        account.deposit(5000);

        System.out.println("New Balance: Rs." + account.getBalance());
    }
}