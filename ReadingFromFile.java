import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("JavaDemoFile.txt");

        Scanner input = new Scanner(file);

        if(file.exists()) {

            while(input.hasNextLine()) {

                String reading = input.nextLine();
                System.out.println("Information stored on the file : " +reading);
            }

        }

        else {

            System.out.println("File doesn't exist");

        }

        input.close();
    }
}