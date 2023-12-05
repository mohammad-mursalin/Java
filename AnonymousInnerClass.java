class Demo
{
    public void show()
    {
        System.out.println("Inside demo");
    }
}
public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo()
        {
            public void show ()
            {
                System.out.println("Inside anonymous inner class");
            }
        };

        obj.show();

    }
    
}
