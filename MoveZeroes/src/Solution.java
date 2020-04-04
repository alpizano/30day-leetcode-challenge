public class Solution {
    public void moveZeroes(int[] nums) {
        int placeholder = nums.length-1;
        int temp = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                // store value in temp var before its erased
                temp = nums[placeholder];

                //copy 0 to end
                nums[placeholder] = nums[i];

                // copy temp to 0's position
                nums[i] = temp;

                //decrement placeholder
                placeholder--;
            }

        }

    }

    public static void main(String[] args) {
        // sample nums array inputs
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{1,3,12,0,0};

        Solution sol = new Solution();

        sol.moveZeroes(nums);
        for(Integer i: nums) {
            System.out.print(i + " ");
        }
    }
}
