public class BufferClass 
{
    public static void main(String[] args) 
    {
        StringBuffer name = new StringBuffer("Mursalin lamon");
        name.append(" 23");
        System.out.println(name);

        /*StringBuffer name2 = new StringBuffer();
        name.append("Mursalin");
        System.out.println(name2);

        String name3 = "Lamon";
        StringBuffer name4 = new StringBuffer(name3);
        System.out.println(name4);*/

        name.reverse();
        System.out.println(name);

        name.delete(0, 5);
        System.out.println(name);

        name.setLength(4);
        System.out.println(name);
    }
}
