public class StaticVsPublicMethod 
{
    static void staticMethod()
    {
        System.out.println("It's a static method");
    }

    public void publicMethod()
    {
        System.out.println("It's a public method");
    }

    public static void main(String[] args) 
    {
        staticMethod();     //for static method you don't need to create object

        StaticVsPublicMethod ob=new StaticVsPublicMethod();     //for public method you need to create ob first
        ob.publicMethod();
    }
}
