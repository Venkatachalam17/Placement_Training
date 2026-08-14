package Tests;


class security
{
    private int accountNumber;  // we cannot access them outside the class;
    private String accountHolderName;
    private long mobilNumber;
    private String accountType;
    private float balance;

    security(int accountNumber, String accountHolderName, long mobilNumber,String accountType, float balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobilNumber = mobilNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

     void display() {
        System.out.println();
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Account Holder name: " + accountHolderName);
        System.out.println("MobilNumber :" + mobilNumber); 
        System.out.println("Account Type :" + accountType);
        System.out.println("Balance :" + balance);
    }

}
public class dataSecurity {
    public static void main(String[] args) {
        
        security a1 = new security(101, "Ram", 9876564321L, "Savings", 100000f);
        a1.display();
    }
    
}
