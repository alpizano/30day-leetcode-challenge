import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    HashSet<Integer> set;
   static int count;

    public Solution() {
        set = new HashSet<>();
        count = 0;
    }

    public int countElements(int[] arr) {

        return 0;
    }

    public void insertSet(int num) {
        set.add(num);
    }

    public void checkSet(int num) {
        if(set.contains(num)) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> arr = new ArrayList(Arrays.asList(1,1,3,3,5,5,7,7));
        List<Integer> arr2 = new ArrayList(Arrays.asList(1,2,3));


        arr2.stream().forEach((x) -> {
            solution.insertSet(x);
            solution.checkSet(x+1);
        });

        int answer = solution.getCount();
        System.out.println(answer);
    }

}
