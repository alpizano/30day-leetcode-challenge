public class Solution {
    public void moveZeroes(int[] nums) {
        int zeros_count = 0;
        int head = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeros_count++;
                    continue;
                }
                nums[head] = nums[i];
                head++;
                if(i > (nums.length-1)-zeros_count) {
                    nums[i] = 0;
                }
            }

    }


    public static void main(String[] args) {
        // sample nums array inputs
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{1,3,12,0,0};
        int[] nums3 = new int[]{0,1,0,3,12};
        int[] nums4 = new int[]{1};
        int[] nums5 = new int[]{0,5};
        int[] nums6 = new int[]{5,0};
        int[] nums7 = new int[]{0,1,0};


        Solution sol = new Solution();

        sol.moveZeroes(nums);
        sol.moveZeroes(nums2);
        sol.moveZeroes(nums3);
        sol.moveZeroes(nums4);
        sol.moveZeroes(nums5);
        sol.moveZeroes(nums6);
        sol.moveZeroes(nums7);

        for(Integer i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i: nums2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i: nums3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i: nums4) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i: nums5) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i: nums7) {
            System.out.print(i + " ");
        }
    }
}
