public class StringMethods 
{
    public static void main(String[] args) 
    {
        String name;
        name="Mursalin Lamon";    //String name = new String("Mursalin Lamon");

        System.out.println("Welcome " +name);
        System.out.println("Length of my name is " +name.length());
        System.out.println("My name in uppercase " +name.toUpperCase());
        System.out.println("My name in lowercase " +name.toLowerCase());
        System.out.println("Position of Lamon is " +name.indexOf("Lamon"));
        System.out.println("Does name contain Lamon?  " +name.contains("Lamon"));
        System.out.println("Is name empty?   " +name.isEmpty());
        System.out.println("Is my name starts with M?   " +name.startsWith("M"));
        System.out.println("Is my name ends with Lamon?   " +name.endsWith("Lamon"));
    }   
}
