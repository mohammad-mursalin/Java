import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int n,count=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer number ");
        n=input.nextInt();

        if(n==0||n==1)
        {
            System.out.println(n+ " is not a prime number");
        }
        else
        {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    count++;
                    break;
                }
            }

            if(count==0)
            {
                System.out.println(n+ " is a prime number");
            }
            else
            {
                System.out.println(n+ " is not a prime number");
            }
        }

        input.close();
    }   
}
