package ClassWork;

class Management {
    int sch_code = 1012;
    int clg_code = 1918;
    int placed_students = 899;
}

// ================= SCHOOL =================

class schools extends Management {
    int starting_year = 1990;
    int total_students = 888;

    void display() {
        System.out.println("========================");
        System.out.println("School details");
        System.out.println("School code : " + sch_code);
        System.out.println("Starting year : " + starting_year);
        System.out.println("Total students : " + total_students);
    }
}

class teachers extends schools {
    int teachers_count = 67;

    void display() {
        super.display();

        System.out.println("Teachers details");
        System.out.println("Total teachers : " + teachers_count);
    }
}

class workers extends schools {
    int total_workers = 400;

    void display() {
        super.display();

        System.out.println("Workers details");
        System.out.println("Total workers : " + total_workers);
    }
}


// ================= COLLEGE =================

class college extends Management {
    String name = "SREC";
    int total_students = 700;

    void display() {
        System.out.println("========================");
        System.out.println("College details");
        System.out.println("College code : " + clg_code);
        System.out.println("Name : " + name);
        System.out.println("Total students : " + total_students);
    }
}

class proff extends college {
    int proff_count = 500;

    void display() {
        super.display();

        System.out.println("Professor details");
        System.out.println("Total professors : " + proff_count);
    }
}

class transport extends college {
    int total_transport = 100;

    void display() {
        super.display();

        System.out.println("Transport details");
        System.out.println("Total transport : " + total_transport);
    }
}


// ================= PLACEMENTS =================

class placements extends Management {
    String Best_company = "ZOHO";
    float highest_package = 1500000f;

    void display() {
        System.out.println("========================");
        System.out.println("Placement details");
        System.out.println("Total placed students : " + placed_students);
        System.out.println("Best company : " + Best_company);
        System.out.println("Highest package : " + highest_package);
    }
}

class staff extends placements {
    int staff_count = 25;

    void display() {
        super.display();

        System.out.println("Staff details");
        System.out.println("Total staff : " + staff_count);
    }
}

class company extends placements {
    String company_name = "ZOHO";
    int vacancies = 150;

    void display() {
        super.display();

        System.out.println("Company details");
        System.out.println("Company name : " + company_name);
        System.out.println("Vacancies : " + vacancies);
    }
}

class training extends placements {
    int training_programs = 10;
    int students_trained = 500;

    void display() {
        super.display();

        System.out.println("Training details");
        System.out.println("Training programs : " + training_programs);
        System.out.println("Students trained : " + students_trained);
    }
}


// ================= MAIN =================

public class Management_inheritance {

    public static void main(String[] args) {

        // School
        schools s = new schools();
        s.display();

        System.out.println();

        // Teachers
        teachers t = new teachers();
        t.display();

        System.out.println();

        // Workers
        workers w = new workers();
        w.display();

        System.out.println();

        // College
        college c = new college();
        c.display();

        System.out.println();

        // Professors
        proff p = new proff();
        p.display();

        System.out.println();

        // Transport
        transport tr = new transport();
        tr.display();

        System.out.println();

        // Placements
        placements pl = new placements();
        pl.display();

        System.out.println();

        // Staff
        staff st = new staff();
        st.display();

        System.out.println();

        // Company
        company co = new company();
        co.display();

        System.out.println();

        // Training
        training trn = new training();
        trn.display();
    }
}
/*

                         Management
                      /      |       \
                     /       |        \
                schools    college   placements
                 /   \      /   \      /  |  \
                /     \    /     \    /   |   \
          teachers  workers proff transport staff company training
 */