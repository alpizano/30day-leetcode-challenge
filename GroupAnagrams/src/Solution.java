import java.lang.reflect.Array;
import java.util.*;

public class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
       boolean found_anagram = false;
        List<List<String>> big_list = new ArrayList();
       Hashtable<String, Integer> memory = new Hashtable();
       ArrayList<Integer> seen_indices = new ArrayList();
       char[] temp = {};
       char[] clone = {};

       for(int i=0; i<strs.length; i++) {
           // Create the list that will hold each anagram group
            found_anagram = false;

           List<String> anagram_list = new ArrayList();

           clone = strs[i].toCharArray();
           Arrays.sort(clone);

           for(int j=i+1; j<strs.length; j++) {

               // Convert the String to a temporary char[] array so it can be sorted
               temp = strs[j].toCharArray();


               // Sort the char[] array
               Arrays.sort(temp);

               if(!memory.containsKey(String.valueOf(clone))) {

                       // Do comparison
                       if (Arrays.equals(clone, temp)) {
                           anagram_list.add(strs[j]);
                       }

               }
               else {
                   found_anagram = true;
                   break;
               }

           }
           // Save the first item
           // Store into memoryt
           System.out.println("Placing " + String.valueOf(clone) + " into Hashtable");
           memory.put(String.valueOf(clone),i);
           if(found_anagram == false) {
               anagram_list.add(strs[i]);
               big_list.add(anagram_list);
           }

           System.out.println("Current list" + big_list);
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
