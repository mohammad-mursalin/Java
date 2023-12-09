// sorting elements based on your own logic
//I'm sortig based on the second number of a number

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJava {
    
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            
            public int compare ( Integer i, Integer j) {

                if(i%10 > j%10)
                    return 1;

                else
                    return -1;
            }
        };
        
        List<Integer> num = new ArrayList<>();

        num.add(34);
        num.add(24);
        num.add(56);
        num.add(73);

        Collections.sort(num,com);

        //Collections.sort(num);

        System.out.println(num);
    }
}
