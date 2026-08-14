package Tests;


class Account {
    static String bankName = "Mariamman Indian Bank"; //it will not allocate memory everytime!

    
    int accountNumber;
    String customerName;


    public Account(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }


    public void display() {
       
        System.out.println("Account :"+accountNumber);
        System.out.println("Owner :"+customerName);
        System.out.println("Bank :"+ bankName);
    }
}


public class bankname {
    public static void main(String[] args) {
        
        Account account1 = new Account(101, "Ramesh");
        Account account2 = new Account(102, "Kumar");
        Account account3 = new Account(103, "sara");

   
        account1.display();
        account2.display();
        account3.display();
    }
}
