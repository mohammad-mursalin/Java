public class TypeConversionAndCasting {
    
    public static void main(String[] args) {
        
        int a = 117;

        byte b = (byte) a;  // Type casting (explicit)

        System.out.println("b = " +b);

        int c = 257;

        byte d = (byte) c;  // 257 % 256

        System.out.println("d = " +d);

        float f = 54.56f;

        int i = (int) f;   //Type conversion because it loose some value

        System.out.println("i = " +i);
    }
}
