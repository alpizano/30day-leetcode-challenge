import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] test3 = new String[]{"tea"};
        List<String> test = new ArrayList();
        List<String> test2 = new ArrayList<>(Arrays.asList("t","e","a"));
        test.add("tea");
        System.out.println(test);
        System.out.println(test2);
        Collections.sort(test);
        Collections.sort(test2);
        System.out.println(test);
        System.out.println(test2);

        for(int i=0; i<test3.length; i++) {
            
        }

    }
}
