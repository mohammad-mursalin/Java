// sorting elements based on your own logic
//I'm sortig based on the second number of a number

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorInJava {
    
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<>();

        num.add(34);
        num.add(24);
        num.add(56);
        num.add(73);

        Collections.sort(num);

        System.out.println(num);
    }
}
