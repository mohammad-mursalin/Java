public class StringCompare 
{
    public static void main(String[] args) 
    {
        String name1="mursalin";
        String name2="shakti";

        System.out.println(name1.equals(name2));

        name1="Mursalin";
        name2="mursalin";

        System.out.println(name1.equalsIgnoreCase(name2));   //here case will be ignored
    }
}
