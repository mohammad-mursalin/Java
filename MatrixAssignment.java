
public class MatrixAssignment 
{
    public static void main( String[] args)
    {
        int p=0;

        int[][] m = new int[4][5];

        for(int i=0;i<4;i++)
        {
            for(int  j=0;j<5;j++)
            {
                m[i][j] = p;
                p++;
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
