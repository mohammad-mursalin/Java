import java.util.Scanner;
public class PalindromeNumberList 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int m,n,temp,rem,sum,count=0;

        System.out.print("Enter the first number of the serise : ");
        m = input.nextInt();
        System.out.print("\nEnter the last number of the serise : ");
        n = input.nextInt();

        System.out.print("Palindrome numbers between " +m+ " to " +n+ " = ");

        for(int i=m;i<=n;i++)
        {
            sum = 0;
            temp = i;

            while(temp!=0)
            {
                rem = temp % 10;
                sum = sum * 10 + rem;
                temp = temp / 10;
            }

            if(sum==i)
            {
                System.out.print("  " +sum);
                count++;
            }
        }

        System.out.println("\nTotal palindrome numbers between " +m+ " to " +n+ " is " +count);

        input.close();
    }
}
