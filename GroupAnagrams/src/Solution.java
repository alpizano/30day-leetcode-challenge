import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {


       for(int i=0; i<strs.length; i++) {
           // Create the list that will hold each anagram group
           List<String> anagram_list = new ArrayList();

           for(int j=1; j<strs.length; j++) {
               // Convert the String to a temporary char[] array so it can be sorted
               char[] temp = strs[j].toCharArray();

               // Sort the char[] array
               Arrays.sort(temp);

               // Do comparison
               if(Arrays.equals(strs[i].toCharArray(),temp) {

               }
           }
       }
   }

    public static void main(String[] args) {
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};

        System.out.println("Hello world");
    }

}
