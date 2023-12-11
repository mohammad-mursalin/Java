import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {

    int roll;
    String name;

    public Students(int roll, String name) {

        this.roll = roll;
        this.name = name;
    }

    public String toString() {

        return "Student > [ name : " +name+ " , roll : "+roll+ "]\n";
    }
}

public class ComparatorStudents {
    
    public static void main(String[] args) {

        Comparator<Students> com = (Students i,Students j) -> { return  (i.roll > j.roll) ? 1 :  -1; };
        
        List<Students> studs = new ArrayList<>();

        studs.add(new Students(01,"Mursalin"));
        studs.add(new Students(06,"Mohammad"));
        studs.add(new Students(02,"Mursa"));
        studs.add(new Students(07,"Lamon"));

        Collections.sort(studs,com);

        System.out.println(studs);
    }
}
