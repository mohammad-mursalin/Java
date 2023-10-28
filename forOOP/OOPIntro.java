package forOOP;

public class OOPIntro 
{
    public static void main(String[] args) 
    {
        DeclaringClass mursalin = new DeclaringClass();
        System.out.println("My occupation is " +mursalin.occupation);

        //you can also change the occupation from here if you want 

        mursalin.occupation = "Programmar";
        System.out.println("My current occupation is " +mursalin.occupation);

        mursalin.location = "Bangladesh";
        System.out.println("My current location is " +mursalin.location);
    }
}
