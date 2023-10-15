public class StaticvariableTest 
{
    public static void main(String[] args) 
    {
        StaticVariable ob = new StaticVariable();
        System.out.println("It's a " +ob.name1+ " variable");

        //for a static variable yoy don't need to create an object
        System.out.println("It's a" +StaticVariable.name2+ "variable");
    }
}
