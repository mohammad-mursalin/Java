import java.io.File;
import java.io.IOException;

public class FileCreating {
    
    public static void main(String[] args) {
        
        File file = new File("JavaDemoFile.txt");

        try {
            if(file.createNewFile()) {

                System.out.println("A new file named by " + file.getName() + " is created successfully");
            }

            else {

                System.out.println("The desired file isn't created");
            }

        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
