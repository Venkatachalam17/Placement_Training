package Placement_Training.ClassWork.Aug_12th_2026.Polymorphism;


/*Overloading happens in the same class usually.

And it is decided during compile time. */

class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class method_Overloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);          // 2 parameters
        c.add(10, 20, 30);      // 3 parameters
        c.add(10.5, 20.5);      // double parameters
    }
}
