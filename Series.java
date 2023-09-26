import java.util.Scanner;
public class Series 
{
    public static void main(String[] args) 
    {
        int n,sum=0;

        System.out.print("Enter the last number of the series ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
            sum=sum+i;
        }  
        System.out.println("\nsum=" +sum); 
        input.close();
    }   
}
