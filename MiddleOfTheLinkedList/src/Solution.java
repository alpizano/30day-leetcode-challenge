public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode middleNode(ListNode head) {
        int count= 0;
        ListNode ans = new ListNode(0);

        for(ListNode curr = head.next; curr != null; curr = curr.next) {
            count++;
        }

        int middle = (count/2) + 1;

        count = 0;
        for(ListNode curr = head.next; curr!= null; curr= curr.next) {
            if(count == middle) {
                ans = curr;
            }
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

