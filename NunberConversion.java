public class NunberConversion 
{
    public static void main(String[] args) 
    {
        //hexa,octal,binary to decimal

        String binary = "11111";   
        Integer decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal number = " +decimal);

        String octal = "567354";   
        Integer deci = Integer.parseInt(octal,8);
        System.out.println("Decimal number = " +deci);

        //decimal to hexa , octal,binary
        
        int dec = 234;
        String bina = Integer.toBinaryString(dec);
        System.out.println("Binary number is : " +bina);


    }
}
