public class StringConcatenation 
{
    public static void main(String[] args) 
    {
        String firstName,lastName,fullName;

        firstName="Mursalin";
        lastName=" Lamon";

        fullName=firstName+lastName;

        System.out.println("My fullname is " +fullName);

        firstName="Mursalin";
        lastName="Lamon";
        System.out.println("My fullname is " +firstName+" "+lastName);

        firstName="Mursalin";
        lastName=" Lamon";
        fullName=firstName.concat(lastName);
        System.out.println("My fullname is " +fullName);
    }
}
