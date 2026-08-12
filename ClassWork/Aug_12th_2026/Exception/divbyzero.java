package ClassWork.Aug_12th_2026.Exception;

public class divbyzero {
    public static void main(String[] args) {
        try {
            int a= 10;
            int b = 20;

            System.out.println(a/b);
            int[] arr = {1,2,3,4,5};


            System.out.println(arr[7]);

        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound error");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divisible by 0");
        }
        finally
        {
            System.out.println("End of program");
        }
    }
}

