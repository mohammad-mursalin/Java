public class MatrixAssignment2 
{
    public static void main(String[] args) 
    {
        int p=0;

        int[][] m = new int[4][];

        m[0] = new int[1];
        m[1] = new int[2];
        m[2] = new int[3];
        m[3] = new int[5];

        for(int i=0;i<4;i++)
        {
            for(int  j=0;j<i+1;j++)
            {
                m[i][j] = p;
                p++;
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
    

