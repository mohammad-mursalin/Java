import java.util.Scanner;

public class PrimeNumberList 
{
    public static void main(String[] args) 
    {
        int m,n,count,totalPrime;
        count=0;
        totalPrime=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting positive integer number= ");
        m=input.nextInt();

        System.out.print("Enter the ending positive integer number= ");
        n=input.nextInt();

        System.out.print("Prime numbers are =");

            for(int x=m;x<=n;x++)
            {
                if(x==0||x==1)
                {
                    continue;
                }
                
                else
                {
                    count=0;

                    for(int i=2;i<=x/2;i++)
                    {
                        if(x%i==0)
                        {
                            count++;
                            break;
                        }
                        
                    }

                    if(count==0)
                    {
                        System.out.print(" " +x);
                        totalPrime++;
                    }

                }
            }

            System.out.println("\nTotal prime number is " +totalPrime);
            
        input.close();
    }
}
