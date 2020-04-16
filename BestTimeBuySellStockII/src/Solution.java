public class Solution {
    public int maxProfit(int[] prices) {
        boolean buy = false;
        boolean sell = false;

        return 0;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{7,1,5,3,6,4};
        int[] differenceArray = new int[intArray.length-1];


        for(int i=0; i+1<intArray.length; i++) {
            differenceArray[i] = intArray[i+1] - intArray[i];
        }

        for(int i: differenceArray) {
            System.out.print(i + " ");
        }
        //System.out.println(differenceArray.length);

        System.out.println("Hello World");
    }
}
