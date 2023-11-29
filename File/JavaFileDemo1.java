import java.io.File;

public class JavaFileDemo1 {

    public static void main(String[] args) {
        
        File dir = new File("Test file1");     //it will create this folder in the same package folder

        dir.mkdir();

        String dirLocation = dir.getAbsolutePath();
        System.out.println("Location of the folder : " +dirLocation);

        System.out.println("Folder name : " +dir.getName());

        if (dir.delete()) {
            
            System.out.println(dir.getName()+ " folder is deleted successfully");
        }

        File dir2 = new File("/home/mursali/Demo File 2");
        dir2.mkdir();

        dirLocation = dir2.getAbsolutePath();
        System.out.println("Location of the folder : " +dirLocation);

        System.out.println("Folder name : " +dir2.getName());
    }
}