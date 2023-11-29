import java.io.File;

public class JavaFileDemo1 {

    public static void main(String[] args) {
        
        File dir = new File("Test file1");

        dir.mkdir();

        String dirLocation = dir.getAbsolutePath();
        System.out.println("Location of the file : " +dirLocation);
    }
}