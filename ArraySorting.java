import java.util.Arrays;

public class ArraySorting 
{
    public static void main(String[] args) 
    {
        int[] number={5,6,3,8,2};

        Arrays.sort(number);

        System.out.print("Ascending : ");

        for(int i=0;i<5;i++)
        {
            System.out.print(number[i]+" ");
        }

        System.out.print("\nDescending : ");

        for(int i=4;i>=0;i--)
        {
            System.out.print(number[i]+ " ");
        }
    }
}
