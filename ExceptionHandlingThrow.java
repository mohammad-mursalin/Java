public class ExceptionHandlingThrow {
    
    public static void main(String[] args) {
        
        int i=7;

        int j=0;

        try
        {

            if(j==0)
                throw new ArithmeticException("I'm forcefully throwing an exception");

        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println(i);
    }
}
