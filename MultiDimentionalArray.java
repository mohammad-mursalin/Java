public class MultiDimentionalArray {
    
    public static void main(String[] args) {
        
        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        // another way for printing it

        for (int[] i : nums) {   

            for(int j : i) {

                System.out.print(j+ " ");
            }
            System.out.println();
            
        }
    }
}
