import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting
{
    public static void main( String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(6);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(1);
        number.add(9);

        Collections.sort(number);
        System.out.println("After sorting number arraylist in ascending : " +number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting number arraylist in descending : " +number);
    }
}