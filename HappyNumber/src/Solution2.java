public class Solution2 {

    public boolean isHappy(int n) {
        int ret =0;
        int sum = n;
        boolean happy = false;

        //int mod = n % 10;
        // int ans = 1 / 10;
        //  System.out.printf("%d and %s", mod,ans);
        while(sum != 1) {
            sum = recursSum(sum);
            if(sum == 1) {
                happy = true;
                break;
            }
        }
        return happy;
    }

    public static int recursSum(int n) {
        int sum = 0;
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
        String ans = concat + "= " + sum ;
        System.out.println(ans);

        return sum;
    }


    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        boolean ans;

        ans = sol.isHappy(19);
        System.out.println(ans);
//        System.out.println(sol.isHappy(19));
    }
}
