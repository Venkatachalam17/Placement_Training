package ClassWork;

/* A class inside another class is called NEsted_class  */

class person 
{
    int age =20;
    String name = "ram";

    //Member of the class
    class student{ // class inside a class (Nested class) 
        int roll = 20;
        String name = "Stud";

        class sample
        {
            int no = 11;
        }
    }

}

public class nested_class {
    public static void main(String[] args) {

        person p = new person();// person class (Object)
        person.student ob = p.new student();

        System.out.println(ob.name); // to access values of students;
        System.out.println(p.age);

        person.student.sample s = ob.new sample();// Create a 3rd ref for a class

        System.out.println(s.no);
        
    }
    
}
