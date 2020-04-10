
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize data structures
        List<List<String>> anagram_list = new ArrayList();
        Hashtable<String, List<String>> memory = new Hashtable();
        List<String> temp_list;

        for (int i = 0; i < strs.length; i++) {
            String[] temp = strs[i].split("");
            Arrays.sort(temp);
            String sorted = String.join("", temp);

            // Key exists, Add to List
            if (memory.containsKey(sorted)) {
                // Get the List that matches this key
                temp_list = memory.get(sorted);
                temp_list.add(strs[i]);
            } else {
                // Key does not exist, so create new list
                List<String> new_list = new ArrayList<>();
                new_list.add(strs[i]);
                memory.put(sorted, new_list);
            }
        }

        // Create the outer List, with nested groups of anagram sub Lists
        for (String key : memory.keySet()) {
            anagram_list.add(memory.get(key));
        }

        return anagram_list;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] input2 = new String[]{"", ""};
        List<List<String>> answer = new ArrayList();

        answer = sol.groupAnagrams(input);
        System.out.println(answer);
        answer = sol.groupAnagrams(input2);
        System.out.println(answer);

    }

}
