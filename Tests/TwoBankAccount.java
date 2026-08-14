package Tests;

class BANK {

    String bankName = "MARIAMMAN INDIAN BANK";

    int accountNumber;
    String accountHolder;
    String mobileNumber;
    String accountType;
    double balance;

    BANK(int accountNumber, String accountHolder,String mobileNumber, String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayDetails() {

        System.out.println("====================================");
        System.out.println("Bank Name    : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type  : " + accountType);
        System.out.println("Balance     : Rs." + balance);
    }
}

public class TwoBankAccount {

    public static void main(String[] args) {

        BANK account1 = new BANK(
            1001,
            "Arun",
            "9876543210",
            "Savings",
            25000
        );

        BANK account2 = new BANK(
            1002,
            "Kumar",
            "9876501234",
            "Current",
            50000
        );

        account1.displayDetails();

        account2.displayDetails();
    }
}