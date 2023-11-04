public class Test {

    public static void main(String[] args) {
        
        Shape[] s = new Shape[3];
         
        s[0] = new Triangle(4, 5);
        s[1] = new Rectangle(6, 12);
        s[2] = new Shape();

        for( Shape i : s)
        {
            System.out.println(i.display());
        }
    }
}