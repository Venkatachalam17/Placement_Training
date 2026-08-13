package ClassWork.Aug_13th_2026.Collections;

import java.util.*;

public class sortEX {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the array (enter a negative number to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            list.add(num);
        }

        // Bubble Sort
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1)); // Set index 'j' to the next element
                    list.set(j + 1, temp);        // Set index 'j+1' to temp
                }
            }
        }

        System.out.println("Sorted list: " + list);
        sc.close(); 
    }
}