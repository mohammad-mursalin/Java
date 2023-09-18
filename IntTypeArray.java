public class IntTypeArray 
{
    public static void main(String[] args) 
    {
        int[] num={1,2,3,4,5};
        
        System.out.println("The value of index 0 is " + num[0]);
        System.out.println("Length of this array is " +num.length);

        num[0]=4;
        System.out.println("Now the value of index 0 is " + num[0]);

        System.out.print("Numbers are =");
        for(int i=0;i<num.length;i++)
        {
            System.out.print( num[i]+ ",");
        }

    }
}
