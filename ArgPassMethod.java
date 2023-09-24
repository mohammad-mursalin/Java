public class ArgPassMethod 
{
    static void argPass(String fname,String lname,int age)
    {
        System.out.println("My full name is " +fname+ " " +lname+ " and I'm " +age);
    }

    public static void main(String[] args) 
    {
        argPass("Mursalin","lamon",23);
        argPass("Mohammad","mursalin",23);
    }
}
