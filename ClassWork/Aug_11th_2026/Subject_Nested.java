class subject{

    String name = "ADAM";

    class web
    {
        int mark = 89;
        String code = "20cs212";
        String staff = "Anusha";

        public void display()
        {
            System.out.println("========================");
            System.out.println("Web development");
            System.out.println("Mark :" +mark);
            System.out.println("Code :"+code);
            System.out.println("Staff :"+staff);
        }
    }

    
    class SDP
    {
        int mark = 89;
        String code = "20cs211";
        String staff = "KK";

        public void display()
        {
            System.out.println("========================");
            System.out.println("SDP");
            System.out.println("Mark :" +mark);
            System.out.println("Code :"+code);
            System.out.println("Staff :"+staff);
        }
    }

    
    class ACD
    {
        int mark = 99;
        String code = "20cs267";
        String staff = "Padma";

        public void display()
        {
            System.out.println("========================");
            System.out.println("ACD");
            System.out.println("Mark :" +mark);
            System.out.println("Code :"+code);
            System.out.println("Staff :"+staff);
        }
    }

}

public class Subject_Nested {
    public static void main(String[] args) {

        subject s = new subject();
        subject.web w = s.new web();
        subject.SDP sdp = s.new SDP();
        subject.ACD a = s.new ACD();

        w.display();
        sdp.display();
        a.display();
        
    }
    
}