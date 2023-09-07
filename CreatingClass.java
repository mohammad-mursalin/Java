class Sum
{
    void adding(int n1,int n2)
    {
        int addition=n1+n2;

        System.out.println("Sum of those two number is " +addition);
    }
}
public class CreatingClass
{
    public static void main(String[] args)
    {
        int num1=3;
        int num2=4;

        Sum result= new Sum();
        result.adding(num1, num2);
    }
}