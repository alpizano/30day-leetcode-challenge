import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] test3 = new String[]{"tea", "ate", "tea","blue"};
        List<String> test = new ArrayList();
        List<String> test2 = new ArrayList<>(Arrays.asList("t","e","a"));
        test.add("tea");
        System.out.println(test);
        System.out.println(test2);
        Collections.sort(test);
        Collections.sort(test2);
        System.out.println(test);
        System.out.println(test2);

        System.out.println(test3);
        System.out.println(test3[0].toCharArray());
        System.out.println(Arrays.equals(test3[0].toCharArray(), test3[2].toCharArray()));

    }
}
