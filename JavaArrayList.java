import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> number = new ArrayList<Integer>();

        System.out.println("Size = " +number.size());

        //adding element

        number.add(3);
        number.add(5);
        number.add(2);
        number.add(3,8);

        //printing element

        System.out.println("number : " +number);
        System.out.println("Size = " +number.size());

        for(int i: number)
        {
            System.out.print(" " +i);
        }

        System.out.println();

        Iterator<Integer> itr = number.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

        //removing element

        number.remove(3);
        System.out.println("\nAfter removing index 3 : " +number);

        number.removeAll(number);
        System.out.println("After removing all the elements : " +number);

        number.add(3);
        number.add(5);
        number.add(2);
        number.add(3,8);

        number.clear();
        System.out.println("After clearing the elements : " +number);

        //some methods

        boolean check = number.isEmpty();
        System.out.println("number array is emty. true or false : " +check);

        number.add(3);
        number.add(5);
        number.add(2);
        number.add(3,8);

        boolean contain= number.contains(8);
        System.out.println("number array contains 8 : " +contain);

        int pos = number.indexOf(8);
        System.out.println("Index of element 8 is " +pos);

        number.set(3,10);
        System.out.println("After setting 10 on index 3 : " +number);

        int x = number.get(2);
        System.out.println("Element of index 2 is " +x);
    }
}
