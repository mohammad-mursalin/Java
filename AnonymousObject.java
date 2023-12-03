class Test
{

    public Test()
    {
        System.out.println("Object created");
    }

    public void show()
    {
        System.out.println("Inside show method");
    }

}

public class AnonymousObject {

    public static void main(String[] args) {
        
        new Test();
        
    }
}