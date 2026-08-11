package ClassWork;

interface car {
    void color();
}

interface tata extends car {
    void founder();
}

interface tata_nano extends tata {
    void year();
}

interface diesel extends tata_nano {
    void rate();
}

interface petrol extends tata_nano {
    void rate();
}

class owner implements diesel, petrol {

    public void color() {
        System.out.println("Color : White");
    }

    public void founder() {
        System.out.println("Founder : Tata Group");
    }

    public void year() {
        System.out.println("Year : 2008");
    }

    public void rate() {
        System.out.println("Rate : 3 lakh");
    }
}

public class hybrid {

    public static void main(String[] args) {

        owner o = new owner();

        o.color();
        o.founder();
        o.year();
        o.rate();
    }
}