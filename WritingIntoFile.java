import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {
    
    public static void main(String[] args) throws IOException {
        
        FileWriter file = new FileWriter("JavaDemoFile.txt");

        file.write("Assalamualaikum everyone this my first file in java . And I'm trying to write something here");
        System.out.println("Writing in file done successfully");
        
        file.close();
    }
}
