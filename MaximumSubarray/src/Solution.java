public class Solution {
    public int maxSubArray(int[] nums) {
        int max_record = 0;
        int curr_max = 0;
        int sum = 0;
        boolean record_init  = false;

        if(nums.length ==1) {
            return nums[0];
        }
        else {
            // brute force O(n^2) solution
            for (int i = 0; i < nums.length; i++) {

                curr_max = nums[i];
                sum = 0;

                for (int j = i; j < nums.length; j++) {
                    sum = sum + nums[j];

                    if (sum >= curr_max) {
                        curr_max = sum;
                    }
                }
                if (curr_max > max_record || record_init == false) {
                    max_record = curr_max;
                    record_init = true;
                }

            }
        }

        return max_record;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = new int[]{-2,-1};

        Solution sol = new Solution();

        System.out.println(sol.maxSubArray(nums));
        System.out.println(sol.maxSubArray(nums2));

    }
}
