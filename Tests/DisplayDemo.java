package Tests;


class details {

    int accountNumber;
    String accountHolderName;

    long mobilNumber; 
    String accountType;
    float balance;

    
    details(int accountNumber, String accountHolderName, long mobilNumber, String accountType, float balance) {
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

public class DisplayDemo {

    public static void main(String[] args) {
       
        details a1 = new details(101, "Ram", 9876564321L, "Savings", 100000f);
        a1.display();
    }
}

