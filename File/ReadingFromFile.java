import java.io.File;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args) {
        
        try {
            
            File file = new File("demoFile02.txt");

            Scanner input = new Scanner(file);

            while (input.hasNext()) {

                String id = input.next();
                String name = input.next();

                System.out.println("Id : " +id+ " Name : " +name);
                
            }

            input.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}