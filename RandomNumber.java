import java.util.Random;

public class RandomNumber 
{
    public static void main( String[] args)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);  //  between 0 to 9
        System.out.println("Random number = " +randomNum);

        int randomnumber = rand.nextInt(10) + 1;   // now it will start from 1  
        System.out.println("Random number = " +randomnumber);    // +1 means +minimum number you wanna see

        int rando = rand.nextInt(10) + 91;   //91 to 100
        System.out.println("Random number = " +rando);  
        
        //By using math function

        int randomNumber = (int) (Math.random()*10 +1);   //1 to 10 
        System.out.println("random number : "+randomNumber);
    }
}
