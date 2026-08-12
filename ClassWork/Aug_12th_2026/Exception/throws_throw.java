package ClassWork.Aug_12th_2026.Exception;

public class throws_throw {

    // 'throws' tells that this method may throw an exception
    static void checkAge(int age) throws Exception {

        if (age < 18) {

            // 'throw' actually throws the exception
            throw new Exception("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}