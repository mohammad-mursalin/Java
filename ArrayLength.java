public class ArrayLength 
{
    public static void main(String[] args) 
    {
        int[] num = new int[5];
        
        num[0] = 7;
        num[1] = 6;
        num[2] = 5;
        num[3] = 4;
        num[4] = 8;

        int len = num.length;

        System.out.println("First element of the array : " +num[0]);
        System.out.println("Length of this array is " +len);

        int[] num2 = {2,3,4,5,6};

        System.out.print("Elements of num2 :");
        for( int i : num2)
        {
            System.out.print(" " +i);
        }
        System.out.println();

        int num3[] = {1,2,3,4,5};

        System.out.print("Elements of num3 :");
        for( int i : num3)
        {
            System.out.print(" " +i);
        }
        System.out.println();

    }
}
