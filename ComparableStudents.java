import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {

    int age;
    String name;

    public Students(int age, String name) {

        this.age = age;
        this.name = name;

    }

        public String toString() {

            return "[Studen :  name : "+name+"   age : "+age+"]\n";
        }

        public int compareTo (Students that) {

            if(this.age > that.age)
                return 1;

            else 
                return -1;
        }

    
}

public class ComparableStudents {
    
    public static void main(String[] args) {
        
        List<Students> studs = new ArrayList<>();

        studs.add(new Students(23,"Lamon"));
        studs.add(new Students(21,"Mursalin"));
        studs.add(new Students(20,"Mohammad"));
        studs.add(new Students(19,"Tamim"));

        Collections.sort(studs);

        for( Students s : studs) {

            System.out.println(s);
        }
    }
}
