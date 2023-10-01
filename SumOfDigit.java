import java.util.Scanner;

public class SumOfDigit 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = input.nextInt();

        int temp = num;
        int rem,sum=0;

        while(temp!=0)
        {
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        System.out.println("Sum of digits of the given number is " +sum);

        input.close();
    }
}
