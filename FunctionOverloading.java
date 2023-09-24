public class FunctionOverloading
{
    static int sumMethod(int x,int y)
    {
        return x+y;
    }

    static double sumMethod(double x,double y)
    {
        return x+y;
    }

    public static void main(String[] args) 
    {
        System.out.println("sum= " +sumMethod(4,7));
        System.out.println("sum= " +sumMethod(4.5,7));
    }
}