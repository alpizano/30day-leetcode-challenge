import java.lang.reflect.Array;
import java.util.*;

public class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
       // Setup
       boolean found_anagram = false;
       List<List<String>> big_list = new ArrayList();
       Hashtable<String, Integer> memory = new Hashtable();
       char[] temp = {};
       char[] clone = {};

       for(int i=0; i<strs.length; i++) {
            found_anagram = false;

           // Create the list that will hold each anagram group
           List<String> anagram_list = new ArrayList();

           // Convert the String to a temporary char[] array so it can be sorted
           clone = strs[i].toCharArray();
           Arrays.sort(clone);

           for(int j=i+1; j<strs.length; j++) {

               // Convert the String to a temporary char[] array so it can be sorted
               temp = strs[j].toCharArray();
               Arrays.sort(temp);

               // Compare to see if Anagram if have not seen value before
               if(!memory.containsKey(String.valueOf(clone))) {
                       // If Anagram, add jth value to List<Strings>
                       if (Arrays.equals(clone, temp)) {
                           anagram_list.add(strs[j]);
                       }

               }
               // If we've seen this value before, skip it and don't add to List
               else {
                   found_anagram = true;
                   break;
               }

           }

           //System.out.println("Placing " + String.valueOf(clone) + " into Hashtable");

           // Store ith value into "memory"
           memory.put(String.valueOf(clone),i);

           // If we haven't seen the value before, add ith value to List<String>, then add entire List<String> to List<List<Strings>>
           if(found_anagram == false) {
               anagram_list.add(strs[i]);
               big_list.add(anagram_list);
           }

           //System.out.println("Current list" + big_list);
       }

//       for(String s: memory.keySet()) {
//           System.out.println(s);
//       }
       return big_list;
   }

    public static void main(String[] args) {
       Solution sol = new Solution();
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> answer = new ArrayList();

        answer = sol.groupAnagrams(input);

        System.out.println(answer);
    }

}
