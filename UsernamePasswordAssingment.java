import java.util.Scanner;

public class UsernamePasswordAssingment 
{
    public static void main(String[] args) 
    {
        String userName = "mursalin";
        String password = "1234";

        String userNameInput;
        String passwordInput;
        
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter Username : ");
            userNameInput = input.nextLine();

            System.out.print("Enter Password : ");
            passwordInput = input.nextLine();
            
            if( userName.equals(userNameInput) && password.equals(passwordInput) )
            {
                System.out.println("Welcome to the system");
            }

            else
            {
                System.out.println("Invalid username or password\n");
                System.out.println("Please inter valid username and password\n");
            }
        }while( !(userName.equals(userNameInput) && password.equals(passwordInput)) );

        input.close();
    }
}
