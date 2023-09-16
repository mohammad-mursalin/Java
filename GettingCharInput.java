import java.util.Scanner;

public class GettingCharInput 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        char ch;

        System.out.print("Enter a character: ");

        ch = input.next().charAt(0);     //charAt(0) for getting only one character

        System.out.println("The character is " +ch);

        input.close();
    }   
}
