package Inheritance;
interface shapes {
    void display();
}

// ---------------- CIRCLE ----------------

interface circle extends shapes {
    void circleArea();
}

// ---------------- SQUARE ----------------

interface square extends shapes {
    void squareArea();
}

// ---------------- RECTANGLE ----------------

interface rect extends shapes {
    void rectangleArea();
}

// ---------------- TRIANGLE ----------------

interface triangle extends shapes {
    void triangleArea();
}

// ---------------- AREA ----------------

interface area extends circle, square {
    void calculateArea();
}

// ---------------- CIRCUMFERENCE ----------------

interface circumference extends rect, triangle {
    void calculateCircumference();
}

// ---------------- CALCULATION ----------------

class calculation implements area, circumference {

    public void display() {
        System.out.println("Shape calculation");
    }

    public void circleArea() {
        System.out.println("Circle area = π × r × r");
    }

    public void squareArea() {
        System.out.println("Square area = side × side");
    }

    public void rectangleArea() {
        System.out.println("Rectangle area = length × breadth");
    }

    public void triangleArea() {
        System.out.println("Triangle area = 1/2 × base × height");
    }

    public void calculateArea() {
        System.out.println("Calculating area...");
    }

    public void calculateCircumference() {
        System.out.println("Calculating circumference...");
    }
}


// ---------------- MAIN ----------------

public class shapes_hybrid {

    public static void main(String[] args) {

        calculation c = new calculation();

        c.display();

        c.circleArea();
        c.squareArea();

        c.rectangleArea();
        c.triangleArea();

        c.calculateArea();
        c.calculateCircumference();
    }
}