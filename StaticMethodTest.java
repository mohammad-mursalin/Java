public class StaticMethodTest 
{
    public static void main(String[] args) 
    {
        StaticMethod ob = new StaticMethod();
        ob.display1();

        StaticMethod.display2();   // for static method you dont need to create object
    }
}
