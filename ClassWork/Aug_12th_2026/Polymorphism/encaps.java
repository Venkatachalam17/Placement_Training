package ClassWork.Aug_12th_2026.Polymorphism;

abstract class employee {

    // Encapsulation
    private String name;
    private float salary;

    public void getName(String name) {
        this.name = name;
    }

    public String setname() {
        return name;
    }

    public void getSalary(float salary) {
        this.salary = salary;
    }

    public float setSalary() {
        return salary;
    }

    // Abstraction
    abstract void Bonus_call();

    abstract void display_All();
}


// developer

class developer extends employee {

    float bonus;

    @Override
    void Bonus_call() {

        bonus = setSalary() * 0.10f;

        System.out.println("Developer bonus : " + bonus);
    }

    @Override
    void display_All() {

        System.out.println("======================");
        System.out.println("Developer Details");
        System.out.println("Name : " + setname());
        System.out.println("Salary : " + setSalary());
        System.out.println("Bonus : " + bonus);
    }
}


// manager

class manager extends employee {

    float bonus;

    @Override
    void Bonus_call() {

        bonus = setSalary() * 0.20f;

        System.out.println("Manager bonus : " + bonus);
    }

    @Override
    void display_All() {

        System.out.println("======================");
        System.out.println("Manager Details");
        System.out.println("Name : " + setname());
        System.out.println("Salary : " + setSalary());
        System.out.println("Bonus : " + bonus);
    }
}

class office_worker extends employee
{
    float bonus;
    @Override
    void Bonus_call()
    {
        bonus = setSalary()*0.01f;
        System.out.println("Worker bonus : " + bonus);
    }

    @Override
    void display_All()
    {
        System.out.println("======================");
        System.out.println("Worker Details");
        System.out.println("Name : " + setname());
        System.out.println("Salary : " + setSalary());
        System.out.println("Bonus : " + bonus);
    }


}


// main

public class encaps {

    public static void main(String[] args) {

        developer d = new developer();

        d.getName("Venkat");
        d.getSalary(50000);

        d.Bonus_call();
        d.display_All();


        System.out.println();


        manager m = new manager();

        m.getName("Rahul");
        m.getSalary(80000);

        m.Bonus_call();
        m.display_All();


        
        office_worker o = new office_worker();

        o.getName("Ramesh");
        o.getSalary(80000);

        o.Bonus_call();
        o.display_All();
    }
}