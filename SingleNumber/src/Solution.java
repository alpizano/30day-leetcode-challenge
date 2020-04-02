import java.util.Hashtable;

public class Solution {
    Hashtable<String,Integer> table = new Hashtable();

    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            if(table.containsKey(String.valueOf(nums[i]))) {
                table.put(String.valueOf(nums[i]),table.get(String.valueOf(nums[i])) + 1);
            }
            else {
                table.put(String.valueOf(nums[i]), 1);
            }
        }

        for(String s: table.keySet()) {
            if(table.get(s).equals(1)) {
                ans = table.get(s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        Solution sol = new Solution();
        System.out.println(sol.singleNumber(nums));
    }
}
