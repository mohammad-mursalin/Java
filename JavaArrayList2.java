import java.util.ArrayList;

public class JavaArrayList2
{
    public static void main(String[] args) {
        
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        System.out.println("array1= " +array1);

        array2.add(5);
        array2.add(6);
        array2.add(7);
        array2.add(8);
        System.out.println("array2= " +array2);

        array3.addAll(array1);
        System.out.println("array3= " +array3);

        boolean result = array1.equals(array2);
        System.out.println("array1=array2  :  " +result);

    }
}