public class WrapperClass 
{
    public static void main(String[] args) 
    {
        //autoboxing
        int x = 30;
        Integer y = x; //Integer y = Integer.valueOf(x);
        System.out.println("Y = " +y);

        //unboxing
        Double m = new Double(10.2);
        double n = m;   //double n = m.doubleValue();
        System.out.println("n = " +n);
    }
}
