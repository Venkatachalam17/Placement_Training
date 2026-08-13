package ClassWork.Aug_13th_2026.Custom_Exception;

class InvalidMarkException extends RuntimeException
{
    InvalidMarkException(String error)
    {
        super(error);
    }
}

class InsufficentMarkException extends RuntimeException
{
    InsufficentMarkException(String error)
    {
        super(error);
    }
}


public class Mark_Exception {

    static void Average(int[] marks) throws RuntimeException
    {
        //Marks more than 100

        int count =0;
        int sum =0;

        for(int i=0;i<marks.length;i++)
        {
            
             if(marks[i]>100)
            {
                throw new InvalidMarkException("Mark must be between 0 and 100");
            } 
            else if(marks[i]<0)
            {
                throw new InsufficentMarkException("Mark must be greater than 0");
            }
            else
            {
                if(count==i)
                {
                sum+=marks[i];
                count++;
                }
                else
                {
                    break;
                }
            }
        }

        float avg = sum/5;

        System.out.println("Average :"+avg);
    }


    public static void main(String[] args) {

        int[] arr = {100,-10,-10,10,10};

        try{
        Average(arr);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
