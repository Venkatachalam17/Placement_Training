package Placement_Training.ClassWork.Aug_12th_2026.Polymorphism;
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override  //This is not necessary but its good to use!
    void sound() {
        System.out.println("Dog barks");
    }
}

public class method_Overriding {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
