package ClassWork.Aug_13th_2026.Custom_Exception;

import java.util.Scanner;

class InvalidPasswordException extends Exception
{
    InvalidPasswordException(String s)
    {
        super(s);
    }
}


class IncorrectPasswordException extends Exception
{
    IncorrectPasswordException(String s)
    {
        super(s);
    }
}
public class Password_validation {

    static void valid(String pass) throws InvalidPasswordException
    {
        if(pass.length()<8)
        {
            throw new  InvalidPasswordException("Password must contain at least 8 characters");
        }
        //Atleast 1 Uppercase
        int upper =0;
        int num =0;
        int spl =0;
        for(int i =0;i<pass.length();i++)
        {
            if(pass.charAt(i)>='A'&&pass.charAt(i)<='Z')
            {
                upper++;
            }
            else if(pass.charAt(i)>='0'&&pass.charAt(i)<='9')
            {
                num++;
            }
            else
            {
                if(pass.charAt(i)>='a'&&pass.charAt(i)<='z')
                {
                    continue;
                }
                else{
                    spl++;
                }
            }
        }
        if(upper==0)
        {
            throw new InvalidPasswordException("Password must contain a uppercase letter");
        }

        else if(num==0)
        {
            throw new InvalidPasswordException("Password must contain a number");
        }
        else if(spl==0)
        {
            throw new InvalidPasswordException("Password must contain a Special character");
        }
        else
        {
            try{
            check(pass);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    static void check(String pass ) throws IncorrectPasswordException
    {
        if(pass.equals("Admin@123"))
        {
            System.out.println("Access Granted");
        }
        else{
            throw new IncorrectPasswordException("Password is invalid");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");

        String password = sc.next();

        try{
        valid(password);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Welcome in...");
        }

    }
    
}
