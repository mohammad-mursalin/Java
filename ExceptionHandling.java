import java.util.Scanner;
public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        /* while (true) {

            try {
            
                Scanner input = new Scanner(System.in);
        
                System.out.print("Enter num1 : ");
                int num1 =  input.nextInt();

                System.out.print("Enter num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;

                System.out.println("Result : " +num1+ "/" +num2+ " = " +result);

                input.close();

            } catch (Exception e) {

                System.out.println("Exception : "  +e);
                System.out.println("You must enter an integer. Please try again");

            }
        } */

        int count = 0;
        
        do {

            try {
            
                Scanner input = new Scanner(System.in);
        
                System.out.print("Enter num1 : ");
                int num1 =  input.nextInt();

                System.out.print("Enter num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;

                System.out.println("Result : " +num1+ "/" +num2+ " = " +result);

                input.close();

            } catch (Exception e) {

                System.out.println("Exception : "  +e);
                System.out.println("You must enter an integer. Please try again");

            }
        }while (count==0);

    }
}
