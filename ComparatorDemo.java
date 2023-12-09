import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            
            public int compare ( String i, String j) {

                if(i.length() > j.length())
                    return 1;

                else
                    return -1;
            }
        };
        
        List<String> num = new ArrayList<>();

        num.add("mursalin");
        num.add("mohammad");
        num.add("lamon");
        num.add("raju");

        Collections.sort(num,com);

        //Collections.sort(num);

        System.out.println(num);
    }
}
