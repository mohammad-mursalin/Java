public class StaticBlock 
{
    static int id;
    static String name;

    static
    {
        id = 123;
        name = "Mursalin";
    }

    static void dislpay()
    {
        System.out.println("name = " +name);
        System.out.println("id = " +id);
    }
}
