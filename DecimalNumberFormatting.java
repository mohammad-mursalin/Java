import java.text.DecimalFormat;

public class DecimalNumberFormatting {

    public static void main(String[] args) {
        
        double d = 3.3434543534;

        DecimalFormat ob = new DecimalFormat("0.00");

        System.out.println("d = " +ob.format(d));
    }
}