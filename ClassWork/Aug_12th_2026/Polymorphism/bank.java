package ClassWork.Aug_12th_2026.Polymorphism;

class bankaccount {

    float account;

    void deposit(float amt) {
        account += amt;
        System.out.println("Amount deposited : " + account);
    }

    void deposit(float amt, String desc) {
        account += amt;
        System.out.println("Description : " + desc);
    }

    void deposit(float amt, String desc, int id_no) {
        account += amt;
        System.out.println("Description : " + desc);
        System.out.println("Transaction number : " + id_no);
    }

    void interest_calculation() {
        System.out.println("Bank interest calculation");
    }
}

class savings extends bankaccount {

    float interest;

    @Override
    void interest_calculation() {
        System.out.println("Savings account");

        interest = account * 0.06f;

        System.out.println("Interest : " + interest);
    }
}

class current extends bankaccount {

    float interest;

    @Override
    void interest_calculation() {
        System.out.println("Current account");

        interest = account * 0.02f;

        System.out.println("Interest : " + interest);
    }
}