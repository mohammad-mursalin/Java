import java.util.Scanner;

public class MatrixInOut 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of row for matrix 1 and 2 : ");
        int row = input.nextInt();

        System.out.print("Enter number of column for matrix 1 and 2 : ");
        int col = input.nextInt();

        int[][] m1 = new int[row][col];

        System.out.println("Enter elements for matrix 1 ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.printf("matrix1[%d][%d]= ",i,j);
                m1[i][j]=input.nextInt();
            }
        }

        int[][] m2 = new int[row][col];

        System.out.println("Enter elements for matrix 2 ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.printf("matrix1[%d][%d]= ",i,j);
                m2[i][j]=input.nextInt();
            }
        }

        System.out.print("m1=");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("\t"+m1[i][j]);
            }
            System.out.println("");
        }

        System.out.print("m2=");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("\t"+m2[i][j]);
            }
            System.out.println("");
        }

        input.close();
    }
}
