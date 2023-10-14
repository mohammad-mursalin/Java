public class VarargsMethod 
{
    void add(int ... num)
    {
        int sum=0;
        
        for(int i : num)
        {
            sum=sum+i;
        }

        System.out.println("Sum : " +sum);
    }
}
