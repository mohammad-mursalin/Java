public class JaggedArray {
    
    public static void main(String[] args) {
        
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[1];

        for(int i=0;i<3;i++)
        {
            for(int j = 0 ; j < nums[i].length ; j++)
            {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j = 0 ; j < nums[i].length ; j++)
            {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        // another way for printing it

        for (int[] i : nums) {   //(int i[] : nums)

            for(int j : i) {

                System.out.print(j+ " ");
            }
            System.out.println();
            
        }
    }
}
