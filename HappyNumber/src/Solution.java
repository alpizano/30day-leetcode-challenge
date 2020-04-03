public class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int test = 0;
        int num = 0;
        String concat = new String();
        int i = 0;

        while (n  != 0) {
            num = n%10;
            if(i > 0) {
                concat = "+ " + concat ;
            }
            concat = num +"^2 " + concat;
            //System.out.println(concat);
            sum = sum + (int)Math.pow(num,2);
            // increment to the left of number
             n = n /10;
             i++;
        }


        //int mod = n % 10;
       // int ans = 1 / 10;
      //  System.out.printf("%d and %s", mod,ans);
        String ans = concat + "= " + sum ;

        System.out.println(ans);
        return true;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        sol.isHappy(19);
//        System.out.println(sol.isHappy(19));
    }
}
