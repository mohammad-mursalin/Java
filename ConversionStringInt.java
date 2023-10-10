public class ConversionStringInt 
{
    public static void main(String[] args) 
    {
        //int to string
        int x = 10;
        String y = Integer.toString(x);
        System.out.println("y = " +y);

        //string to int
        int m = Integer.parseInt(y);
        System.out.println("m = " +m);

        int n = Integer.valueOf(y);
        System.out.println("n = " +n);
    }
}
