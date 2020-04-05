import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public void moveZeroes(int[] nums) {
        int zeros_count = 0;
        int head = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int )

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

        Solution sol = new Solution();

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
