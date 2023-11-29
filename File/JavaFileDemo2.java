import java.io.File;

public class JavaFileDemo2 {
    
    public static void main(String[] args) {
        
        File file = new File("FileDemo.txt");

        try {
            
            file.mkdir();
            System.out.println("File is created");

        } catch (Exception e) {

            System.out.println(e);
        }

        if (file.exists()) {
            
            System.out.println("file exists");

        } else {
            
            System.out.println("File does not exists");
        }

        file.delete();

        if (file.exists()) {
            
            System.out.println("file exists");

        } else {
            
            System.out.println("File does not exists");
        }
    }
}
