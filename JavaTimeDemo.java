import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeDemo 
{
    public static void main(String[] args) 
    {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = currentTime.format(formatter);
        System.out.println(time);
    }
}
