import java.util.Scanner;

public class ArrayAssignment 
{
    public static void main(String[] args) 
    {
        String[] weekdays = {"Monday","Tuesday","Wednesday","Trusday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number between 1 and 7 to know the day name : ");
        int day = input.nextInt();

        if(day<1 || day>7)
        {
            System.out.println("Invalid number\nPlease enter number between 1 and 7");
        }
        else
        {
            System.out.println("Today is " +weekdays[day-1]);
        }

        input.close();
    }
}
