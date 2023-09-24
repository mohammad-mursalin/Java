public class JavaRecursion 
{
    static int sum( int x )
    {
        if(x>0)
        {
            return x+sum(x-1);
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) 
    {
        int sum = sum(10);

        System.out.println("The sum is " +sum);
    }
}
