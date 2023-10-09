public class StingMethod02 
{
    public static void main(String[] args) 
    {
        String country = "Bangladesh is my country";

        char ch = country.charAt(0);
        System.out.println("Character at index 0 is " +ch);

        int value = country.codePointAt(0);
        System.out.println("Asci value of the character at index 0 is " +value);

        int pos = country.lastIndexOf("n");
        System.out.println("Index of the last n is " +pos);

        country = "   Bangladesh is my country   ";
        String trimed = country.trim();
        System.out.println("After triming spaces of first and last : " +trimed);

        String replace = country.replace("i","j");
        System.out.println("Replacing all the i with j : " +replace);

        String[] split = country.split(" ");   //it will split country where it will found " "
        for( String i : split)
        {
            System.out.println(i);
        }
    }
}
