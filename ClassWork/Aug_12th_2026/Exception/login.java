package ClassWork.Aug_12th_2026.Exception;

import java.util.*;

class login {

    void checkLogin(String username, String password) throws Exception {

        if (!username.equals("admin")) {
            throw new Exception("Invalid Username");
        }

        if (!password.equals("1234")) {
            throw new Exception("Invalid Password");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        login l = new login();

        try {
            l.checkLogin(username, password);
        }
        catch (Exception e) {
            System.out.println("Login Failed: " + e.getMessage());
        }

        sc.close();
    }
}