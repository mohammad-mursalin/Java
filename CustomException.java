class MursalinException extends Exception {

    public MursalinException ( String string) {

        super(string);
    }
}

public class CustomException {
    
    public static void main(String[] args) {
        
        int i = 0;

        try {

            if (i == 0)
                throw new MursalinException("I don't wanna print zero");

        }

        catch (MursalinException e) {

            System.out.println(e);
            System.out.println("I'm using custom exception here");
        }
    }
}
