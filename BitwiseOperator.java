public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int x,y,z;

        x=5;
        y=7;

        z=x|y;
        System.out.println("Bitwise or of x and y is z=" +z);   

        z=x&y;
        System.out.println("Bitwise and of x and y is z=" +z);

        z=x^y;
        System.out.println("Bitwise xor of x and y is z=" +z);

        z=x>>2;
        System.out.println("Bitwise right shift of x is z=" +z);

        z=x<<2;
        System.out.println("Bitwise left shift of x is z=" +z);

        z=~x;
        System.out.println("Bitwise compliment of x is z=" +z);
    }
}
