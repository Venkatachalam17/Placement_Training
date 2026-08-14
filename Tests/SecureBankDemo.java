package Tests;

class SecureBankAccount {

    private long accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

  
    SecureBankAccount(long accountNumber, String accountHolderName,String mobileNumber, String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
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

    
    public void deposit(double amount) {
        balance = balance + amount;
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}


public class SecureBankDemo {

    public static void main(String[] args) {

        SecureBankAccount account = new SecureBankAccount(
            12345,
            "Venkat",
            "9876543210",
            "Savings",
            10000
        );

       
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Name: " + account.getAccountHolderName());
        System.out.println("Mobile: " + account.getMobileNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance());

    
        account.deposit(5000);

   
        account.withdraw(2000);

        System.out.println("\nAfter Updates:");

        System.out.println("Mobile: " + account.getMobileNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
