public class Solution {
    public void moveZeroes(int[] nums) {
        int placeholder = nums.length-1;
        int dynamic_length = nums.length-1;
        int temp = 0;
        int ptr = 1;

        for(int i=0; i<dynamic_length; i++) {
           for(int j=0; j<nums.length; j++) {
               if(nums[j] == 0) {
                   temp = nums[placeholder];
                   
               }
            }
        }
    }

    public static void main(String[] args) {
        // sample nums array inputs
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{1,3,12,0,0};
        int[] nums3 = new int[]{0,1,0,3,12};

        Solution sol = new Solution();

        sol.moveZeroes(nums3);
        for(Integer i: nums3) {
            System.out.print(i + " ");
        }
    }
}
