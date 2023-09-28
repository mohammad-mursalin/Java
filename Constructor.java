public class Constructor 
{
    int age;
    String name;

    public Constructor(int x,String y)      //constructor method name must match class name
    {
        age=x;
        name=y;
    }

    public static void main(String[] args) 
    {
        Constructor ob = new Constructor(23, "Mursallin");

        System.out.println("My name is " +ob.name+ " and I'm " +ob.age+ " years old");
    }
}
