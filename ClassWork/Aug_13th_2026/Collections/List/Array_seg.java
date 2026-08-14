package ClassWork.Aug_13th_2026.Collections.List;

import java.util.*;

public class Array_seg {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values for the array");

        while(true)
        {
            int num = sc.nextInt();
            if(num<0)
            {
                break;
            }
            list.add(num);
        }

        System.out.println("Array List before segrigation: "+list);

        int c = 0; // Insertion pointer for non-multiples of 10
        int s = 0; // Scanning pointer that moves through the list

        
        while(s < list.size())
        {
           
            if(list.get(s) % 10 != 0)
            {
                int temp = list.get(s);
                
                
                for(int i = s; i > c; i--)
                {
                    list.set(i, list.get(i-1));
                }
                list.set(c, temp);

                c++; 
            }
            
            
            s++; 
        }

        System.out.println("Array list after segriggation: " + list);
    }
}
