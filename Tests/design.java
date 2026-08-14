package Tests;

class req
{
    public int accountNumber;  
    private String accountHolderName;
    private long mobilNumber;
    public String accountType;
    private float balance;

   

    req(int accountNumber,String accountType)
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    
    }

    void name_setter(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    void mobil_setter(long mobilNumber)
    {
        this.mobilNumber = mobilNumber;
    }

   
    void balance_setter(float balance)
    {
        this.balance = balance;
    }

    void deposit(float amount)
    {
      balance+=amount;
      System.out.println("Amount deposited successfully");
    }
    void withdraw(float amount)
    {
        if(amount>balance)
        {
            System.out.println("Insuffessient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw successfully");
        }
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

public class design {
    public static void main(String[] args) {
        req account1 = new req(101,"Savings");

        account1.balance_setter(10000);
        account1.name_setter("Ramesh");
        account1.mobil_setter(9876423412l);
        
        account1.display();

        account1.deposit(10000);
        account1.withdraw(8990);

        account1.display();
      
      
    }
}
