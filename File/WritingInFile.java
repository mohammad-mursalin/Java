import java.util.Formatter;

public class WritingInFile {
    
    public static void main(String[] args) {
        
        try {
            
            Formatter formatter = new Formatter("demoFile01.txt");

            formatter.format("%s %s\n", "01","Mursalin");
            formatter.format("%s %s\n", "02","Mohammad");

            formatter.close();
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
