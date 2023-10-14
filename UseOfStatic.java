public class UseOfStatic 
{
    static int count = 0;

    UseOfStatic()
    {
        count++;
    }

    void displayInfo()
    {
        System.out.println("Total students " +count);
    }
}
