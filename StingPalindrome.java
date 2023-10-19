public class StingPalindrome 
{
    public static void main(String[] args) 
    {
        String str1 = "madam";
        StringBuffer str2 = new StringBuffer(str1);

        String str3 = str2.reverse().toString();

        if(str1.equals(str3))
        {
            System.out.println(str1+ " is palindrome");
        }
        else
        {
            System.out.println(str1+ " is not a palindrome word");
        }
    }
}
