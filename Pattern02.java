
import java.util.Scanner;

public class Pattern02 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                if(col%2==0)
                {
                    System.out.print(" 0");
                }
                else
                {
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }

        input.close();
    }
}

