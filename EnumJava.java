enum Status
{
    Walking,Running,Reached
}

public class EnumJava 
{

    public static void main(String[] args) {
        
        Status s = Status.Walking;
        
        System.out.println(s);

        s = Status.Reached;

        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        for(Status x : ss)
        {
            System.out.println(x);
        }
    }   
}
