public class FinalVariable
{
    final String UNI_NAME = "PUST";
    final String session;   // Blank final variable
    static final int year;  //static blank final variable

    FinalVariable()
    {
        session = "21-22";
    }

    static
    {
        year = 2023;
    }

    void display()
    {
        System.out.println("University name : " +UNI_NAME);
        System.out.println("Session : " +session);
        System.out.println("Year : " +year);
    }
}