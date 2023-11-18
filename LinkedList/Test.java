import java.util.LinkedList;

public class Test {
    
    public static void main(String[] args) {
        
        LinkedList<Student> list = new LinkedList<Student>();

        Student s1 = new Student("Mursalin",23);
        Student s2 = new Student("Mohammad",22);
        Student s3 = new Student("Lamon",24);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student s : list) {

            System.out.println(s.name+ "  " +s.roll+ " ");
        }
    }
}
