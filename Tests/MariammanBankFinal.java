package Tests;

class MariammanAccount {

    private int accountNumber;
    private String accountHolder;
    private String mobileNumber;
    private String accountType;
    private double balance;

    MariammanAccount(int accountNumber, String accountHolder,String mobileNumber, String accountType,double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

   
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Deposit
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance = balance + amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {

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

    
    public void displayAccountDetails() {

        System.out.println("====================================");
        System.out.println("       MARIAMMAN INDIAN BANK");
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}


public class MariammanBankFinal {

    public static void main(String[] args) {

        
        MariammanAccount account1 = new MariammanAccount(
            1001,
            "Arun",
            "9876543210",
            "Savings",
            25000
        );

      
      
        System.out.println("ACCOUNT 1");
        account1.displayAccountDetails();

        account1.deposit(5000);
        System.out.println("\nAfter depositing Rs.5000: Rs." + account1.getBalance());

        account1.withdraw(3000);
        System.out.println("After withdrawing Rs.3000: Rs." + account1.getBalance());

        account1.setMobileNumber("9999999999");
        System.out.println("Updated Mobile Number: " + account1.getMobileNumber());

        
        account1.deposit(-1000);

       
        account1.withdraw(-500);

       
        account1.withdraw(100000);



      
    }
}
