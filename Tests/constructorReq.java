package Tests;

class connect
{
    private int accountNumber;  
    private String accountHolderName;
    private long mobilNumber;
    private String accountType;
    private float balance;

    connect()
    {
        System.out.println("Non- Paramatrized constructor");
    }

    connect(int accountNumber, String accountHolderName, long mobilNumber,String accountType, float balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobilNumber = mobilNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void number_setter(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    void name_setter(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    void mobil_setter(long mobilNumber)
    {
        this.mobilNumber = mobilNumber;
    }

    void type_setter(String accountType)
    {
        this.accountType = accountType;
    }

    void balance_setter(float balance)
    {
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

public class constructorReq {
    public static void main(String[] args) {
        
      
        connect a1 = new connect(101, "Ram", 9876564321L, "Savings", 100000f);
        a1.display();

      
        connect a2 = new connect();
        
        
        a2.number_setter(102);
        a2.name_setter("Sam");
        a2.mobil_setter(9123456789L);
        a2.type_setter("Current");
        a2.balance_setter(50000f);
        
        a2.display();
    }
}
