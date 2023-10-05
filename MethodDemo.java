public class MethodDemo 
{
    static int returnMethod(int x)
    {
        return 5+x;
    }

    public static void main(String[] args) 
    {
        int x=5;

        System.out.println("Sum is " + returnMethod(x));

        int sum=returnMethod(x);
        System.out.println("Returned value is " +sum);
    }
}
