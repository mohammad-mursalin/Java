public class Test 
{
    public static void main(String[] args) 
    {
        Teacher t1 = new Teacher();
        t1.setName("Mursalin");
        t1.setAge(23);
        t1.setStatus("Teacher");
        t1.displayT();

        System.out.println();

        Teacher t2 = new Teacher();
        t2.setName("Lamon");
        t2.setAge(23);
        t2.setStatus("Teacher");
        t2.displayT();
    }
}
