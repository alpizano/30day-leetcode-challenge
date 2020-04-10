//import java.util.*;
//
//public class Solution2 {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        // Setup
//        boolean found_anagram = false;
//        List<List<String>> big_list = new ArrayList();
//       // Hashtable<String, Integer> seen_indices = new Hashtable();
//        HashSet<Integer> seen_indices = new HashSet<>();
//        String[] temp = {};
//        String[] clone = {};
//
//
//
//        for(int i=0; i<strs.length; i++) {
//
//            // Create the list that will hold each anagram group
//            List<String> anagram_list = new ArrayList();
//
//            // Convert the String to a temporary char[] array so it can be sorted
//            clone = strs[i].split("");
//            Arrays.sort(clone);
//
//            if(seen_indices.contains(i)) {
//                continue;
//            }
//            else {
//                anagram_list.add(strs[i]);
//            }
//
//            for(int j=i+1; j<strs.length; j++) {
//
//                // Convert the String to a temporary char[] array so it can be sorted
//                temp = strs[j].split("");
//                Arrays.sort(temp);
//
//                if(seen_indices.contains(j)) {
//                    continue;
//                }
//
//                // Compare to see if Anagram if have not seen value before
//
//                    // If Anagram, add jth value to List<Strings>
//                    if (Arrays.equals(clone, temp)) {
//                        anagram_list.add(strs[j]);
//                        seen_indices.add(j);
//
//                    }
//            }
//
//            //System.out.println("Placing " + String.valueOf(clone) + " into Hashtable");
//
//
//            // If we haven't seen the value before, add ith value to List<String>, then add entire List<String> to List<List<Strings>>
//                big_list.add(anagram_list);
//
//
//            //System.out.println("Current list" + big_list);
//        }
//
////       for(String s: memory.keySet()) {
////           System.out.println(s);
////       }
//        return big_list;
//    }
//
//    public static void main(String[] args) {
//        Solution2 sol = new Solution2();
//        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
//        String[] input2 = new String[]{"",""};
//        List<List<String>> answer = new ArrayList();
//
//        answer = sol.groupAnagrams(input2);
//
//        System.out.println(answer);
//    }
//
//}
