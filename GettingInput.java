import java.util.Scanner;

public class GettingInput 
{
    public static void main(String[] args)
    {
        int num;

        Scanner input = new Scanner(System.in);
            System.out.print("Enter a number= ");
            num=input.nextInt();
        

        System.out.println("The number is " +num);

        input.close();
    }
}
