import java.util.Scanner;

class BankAccount
{
    int accountNumber;
    String holderName;
    int balance;
    int pin;

    BankAccount(int accountNumber, String holderName, int balance, int pin)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.pin = pin;
    }

    void withdraw(int amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(int amount)
    {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    void checkBalance()
    {
        System.out.println("Balance: ₹" + balance);
    }

    void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount
{
    float interestRate;

    SavingsAccount(int accountNumber, String holderName, int balance, int pin, float interestRate)
    {
        super(accountNumber, holderName, balance, pin);
        this.interestRate = interestRate;
    }

    void withdraw(int amount)
    {
        if(balance - amount >= 1000)
        {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else
        {
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}


class CurrentAccount extends BankAccount
{
    int overdraftLimit = 5000;

    CurrentAccount(int accountNumber, String holderName, int balance, int pin)
    {
        super(accountNumber, holderName, balance, pin);
    }

    void withdraw(int amount)
    {
        if(balance - amount >= -overdraftLimit)
        {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else
        {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


public class Atm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(1001, "Venkat", 30000, 1234, 5.5f);

        System.out.println("===== ATM MACHINE =====");

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if(accNo == account.accountNumber && pin == account.pin)
        {
            System.out.println("\nLogin Successful!");

            while(true)
            {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                        account.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount: ₹");
                        int amount = sc.nextInt();

                        System.out.println("Processing...");
                        account.withdraw(amount);
                        System.out.println("Remaining Balance: ₹" + account.balance);
                        break;

                    case 3:
                        System.out.print("Enter amount: ₹");
                        int depositAmount = sc.nextInt();

                        account.deposit(depositAmount);
                        break;

                    case 4:
                        account.displayDetails();
                        break;

                    case 5:
                        System.out.println("Thank you for using the ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

                if(choice == 5)
                {
                    break;
                }
            }
        }
        else
        {
            System.out.println("Invalid Account Number or PIN.");
        }

        sc.close();
    }
}