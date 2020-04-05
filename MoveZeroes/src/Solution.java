public class Solution {
    public void moveZeroes(int[] nums) {
        int zeros_count = 0;
        int placeholder = nums.length-1;
        int head = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros_count++;
            }
            else {
                nums[head] = nums[i];
                nums[i] = 0;
                head++;
            }
            if(i > nums.length-zeros_count) {
                nums[i] = 0;
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
