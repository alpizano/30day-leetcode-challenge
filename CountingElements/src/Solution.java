import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    HashSet<Integer> set;
    int count;

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

    public boolean checkSet(int num) {
        return set.contains(num);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        Solution solution = new Solution();

        List<Integer> arr = new ArrayList(Arrays.asList(1,1,3,3,5,5,7,7));

        arr.stream().forEach((x) -> {
            solution.insertSet(x);
            if(solution.checkSet(x+1)) {

            }
        });
    }

}
