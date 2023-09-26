import java.util.Scanner;

public class VowelConsonant 
{
    public static void main(String[] args) 
    {
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        ch = input.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("The lette is a vowel"); 
        }
        else
        {
            System.out.println("The lette is a consonant");
        }

        input.close();
    }   
}
