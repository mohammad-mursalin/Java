/* Older version of switch
int day = 4;
switch (day) 
{
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
*/
//updated version of switch
public class Switch 
{
    public static void main( String[] args)
    {
        String day="sunday";

        switch(day)
        {
            case "saturday","sunday" -> System.out.println("6am");    //Because we've used -> now we don't need to use break
            case "monday","tuesday" -> System.out.println("5am");
            default -> System.out.println("8am");
        }

        // Switch as expression 
        
        String d="sunday";
        int result;

        switch(d)
        {
            case "saturday","sunday" -> result=6;
            case "monday","tuesday" -> result=5;
            default -> result=8;
        };                                            //notice that we have used semi colon after }


        System.out.println(result);

        String date="sunday";
        String res;

        res=switch(date)
        {
            case "saturday","sunday" -> "6am";        //this will return the value to res
            case "monday","tuesday" -> "5am";         //you can also use case "monday","tuesday" : yield "5am";
            default -> "8am";
        };                                            //notice that we have used semi colon after }

        System.out.println(res);
    }
}
