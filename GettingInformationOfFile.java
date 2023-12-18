import java.io.File;

public class GettingInformationOfFile {
    
    public static void main(String[] args) {
        
        File file = new File("JavaDemoFile.txt");

        if(file.exists()) {

            System.out.println("The file named by " +file.getName()+ " is exists");
            System.out.println("The absulate path of the file is " +file.getAbsolutePath());
            System.out.println("Is the file writable ? " +file.canWrite());
            System.out.println("Is the file readable ? " + file.canRead());

        }

        else {

            System.out.println("The desired file doesn't exist");
        }
    }
}
