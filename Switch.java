public class Switch 
{
    public static void main( String[] args)
    {
        String day="sunday";

        switch(day)
        {
            case "saturday","sunday" -> System.out.println("6am");
            case "monday","tuesday" -> System.out.println("5am");
            default -> System.out.println("8am");
        }

        String d="sunday";
        int result;

        switch(d)
        {
            case "saturday","sunday" -> result=6;
            case "monday","tuesday" -> result=5;
            default -> result=8;
        };

        System.out.println(result);

        String date="sunday";
        String res;

        res=switch(date)
        {
            case "saturday","sunday" -> "6am";
            case "monday","tuesday" -> "5am";
            default -> "8am";
        };

        System.out.println(res);
    }
}
