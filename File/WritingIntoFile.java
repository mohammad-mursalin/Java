import java.util.Formatter;
import java.util.Scanner;

public class WritingIntoFile {
    
    public static void main(String[] args) {

        String id,name;
        
        try {
            
            Formatter formatter = new Formatter("demoFile02.txt");

            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of students : ");

            int num = input.nextInt();

            for(int i = 1; i<=num; i++)
            {
                System.out.print("Student id : ");
                id = input.next();

                System.out.print("Student name : ");
                name = input.next();

                formatter.format("%s %s\n", id,name);
            }

            input.close();
            formatter.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
