import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //public void groupAnagrams(String[] strs) {
        // Setup
        List<List<String>> anagram_list = new ArrayList();
        List<String> inner_list = new ArrayList<>();
        Hashtable<String, List<String>> memory = new Hashtable();
      // HashSet<String> memory = new HashSet<>();
       String[] temp = {};
        String[] sorted_array = new String[strs.length];


        List<String> temp_list = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {
            temp = strs[i].split("");
            Arrays.sort(temp);
            String sorted = String.join("", temp);

            // If value is already a key in Hashtable
            if(memory.containsKey(sorted)) {
               temp_list =  memory.get(sorted);
               temp_list.add(strs[i]);
            }
            else {
                // create the List
                List<String> new_list = new ArrayList<>();
                new_list.add(strs[i]);
                memory.put(sorted, new_list);
            }
        }

        for(String key: memory.keySet()) {
            anagram_list.add(memory.get(key));
        }


     return anagram_list;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        String[] input2 = new String[]{"",""};
        List<List<String>> answer = new ArrayList();

        answer = sol.groupAnagrams(input);
        //sol.groupAnagrams(input);
       System.out.println(answer);
        answer = sol.groupAnagrams(input2);
        System.out.println(answer);

    }

}
