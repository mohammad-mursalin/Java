public class StaticBlockTest 
{
    static
    {
        System.out.println("This static bloc is exicuted befor than the main function");
    }
    public static void main(String[] args) 
    {
        StaticBlock.dislpay();
    }
}
