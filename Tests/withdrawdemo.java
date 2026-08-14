package Tests;

class WithdrawAccount {

    private double balance;

    WithdrawAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) { //withdraw logic

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class withdrawdemo {

    public static void main(String[] args) {

        WithdrawAccount account = new WithdrawAccount(30000);

        System.out.println("Balance: Rs." + account.getBalance());

        account.withdraw(8000);

        System.out.println("New Balance: Rs." + account.getBalance());
    }
}