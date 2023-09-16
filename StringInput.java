import java.util.Scanner;

public class StringInput 
{
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Enter your name:");

        Scanner input = new Scanner(System.in);
            name=input.nextLine();

        System.out.println("Welcome " +name);

        input.close();
    }
}
