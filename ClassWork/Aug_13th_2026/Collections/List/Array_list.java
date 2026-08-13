package ClassWork.Aug_13th_2026.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Array_list {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        // ================= INSERT =================

        // Add at last
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at first
        list.add(0, 5);

        // Add at any position
        list.add(2, 15);

        System.out.println("After insertion:");
        System.out.println(list);


        // ================= GET =================

        // Get element using index
        System.out.println("Element at index 2: " + list.get(2));


        // ================= UPDATE =================

        // Change element at index
        list.set(2, 100);

        System.out.println("After update:");
        System.out.println(list);


        // ================= REMOVE =================

        // Remove using index
        list.remove(2);

        System.out.println("After removing index 2:");
        System.out.println(list);


        // Remove using value
        list.remove(Integer.valueOf(20));

        System.out.println("After removing value 20:");
        System.out.println(list);


        // ================= SEARCH =================

        System.out.println("Contains 30: " + list.contains(30));

        System.out.println("Index of 30: " + list.indexOf(30));


        // ================= SIZE =================

        System.out.println("Size: " + list.size());


        // ================= CHECK EMPTY =================

        System.out.println("Is empty: " + list.isEmpty());


        // ================= CLEAR =================

        list.clear();

        System.out.println("After clear:");
        System.out.println(list);
    }
}