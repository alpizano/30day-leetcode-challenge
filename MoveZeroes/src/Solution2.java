public class Solution2 {

    public void moveZeroes(int[] nums) {
        int zeros_count = 0;
        int head = 0;

        // Additional data structure
        int[] temp = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            // count zeros
            if(nums[i] == 0) {
                zeros_count++;
                continue;
            }
            // else write non-zero digit to temp array
            temp[head]=nums[i];
            head++;
        }

        // pad end of temp array with zeros
        for(int j=nums.length-zeros_count; j<zeros_count; j++) {
            temp[j] = 0;
        }

        // Copy elements from temp array to nums array
       for(int k = 0; k< temp.length; k++) {
           nums[k] = temp[k];
       }
    }

    public static void print(int[] nums) {
        for(Integer i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
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

        Solution2 sol = new Solution2();

        sol.moveZeroes(nums);
        sol.moveZeroes(nums2);
        sol.moveZeroes(nums3);
        sol.moveZeroes(nums4);
        sol.moveZeroes(nums5);
        sol.moveZeroes(nums6);
        sol.moveZeroes(nums7);

        print(nums);
        print(nums2);
        print(nums3);
        print(nums4);
        print(nums5);
        print(nums6);
        print(nums7);
    }
}
