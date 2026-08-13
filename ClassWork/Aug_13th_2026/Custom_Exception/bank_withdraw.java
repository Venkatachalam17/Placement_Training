package ClassWork.Aug_13th_2026.Custom_Exception;

import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String str)
    {
        super(str);
    }
}

class BankAccount{
    float balance;

    BankAccount(float balance)
    {
        this.balance = balance;
    }

    void withdraw(float amount) throws InsufficientBalanceException
    {
        if(amount <=balance)
        {
            balance-=amount;
        }
        else{
            throw new InsufficientBalanceException("Insufficent Balance");
        }
    }
}

public class bank_withdraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        BankAccount b = new BankAccount(10000);


        System.out.println("Enter an amount");

        try{
            float amount;
            amount = sc.nextFloat();

            b.withdraw(amount); 
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of Banking");
        }
        
    }
    
}
