abstract class BankAccount
{
    private int accountNo;
    private String name;
    protected float balance;

    BankAccount(int accountNo, String name)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
    }

    BankAccount(int accountNo, String name, float balance)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    abstract void deposit(float amount);
    abstract void withdraw(float amount);
    abstract void display();

    public int getAccountNo()
    {
        return accountNo;
    }

    public String getName()
    {
        return name;
    }

    public float getBalance()
    {
        return balance;
    }
}


class SavingsAccount extends BankAccount
{
    float interestRate;

    SavingsAccount(int accountNo, String name, float balance, float interestRate)
    {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    void deposit(float amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(float amount)
    {
        if(balance - amount >= 1000)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Minimum balance of Rs.1000 must be maintained");
        }
    }

    void display()
    {
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}


class CurrentAccount extends BankAccount
{
    float overdraftLimit = 5000;

    CurrentAccount(int accountNo, String name, float balance)
    {
        super(accountNo, name, balance);
    }

    CurrentAccount(int accountNo, String name, float balance, float overdraftLimit)
    {
        super(accountNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void deposit(float amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(float amount)
    {
        if(balance - amount >= -overdraftLimit)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Overdraft limit exceeded");
        }
    }

    void display()
    {
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


public class banking
{
    public static void main(String[] args)
    {
        BankAccount account1 = new SavingsAccount(101, "Venkat", 5000, 5.5f);

        account1.deposit(1000);
        account1.withdraw(4500);
        account1.display();

        System.out.println();

        BankAccount account2 = new CurrentAccount(102, "Rahul", 2000);

        account2.deposit(1000);
        account2.withdraw(7000);
        account2.display();
    }
}