package ClassWork;

/* Blocks -->Instant block, Static block , Local block 

    {
    S.O.P("Can print");
    int val;
    method()
    }
*/ 

public class blocks {

    {
        System.out.println("Block output");// Instant block
    }

    static{
        System.out.println("Static Block"); // Static Block
    }
    public static void main(String[] args) {

        blocks b = new blocks();
        System.out.println("This is a main");

        //Local Block
        {
            int a =10;
            System.out.println("Local Block : "+ a); // Cannot use outside the block !
        
        }


    }
    
}