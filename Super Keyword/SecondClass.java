public class SecondClass extends FirstClass
{
    int x = 5;

    void display()
    {
        System.out.println("X = " +x);
        System.out.println("X = " +super.x);
    }
}