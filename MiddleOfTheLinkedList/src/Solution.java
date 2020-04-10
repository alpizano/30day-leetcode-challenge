class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

    class Solution {
    public ListNode middleNode(ListNode head) {
            int count = 0;
            ListNode ans = new ListNode(0);

            for (ListNode curr = head; curr != null; curr = curr.next) {
                count++;
            }

            int middle = (count / 2) + 1;
            count = 1;

            for (ListNode curr = head.next; curr != null; curr = curr.next) {
                if (count == middle) {
                    ans = curr;
                }
                count++;
            }

            return ans;
        }

        public static void main(String[] args) {
            System.out.println("Hello world");
            Solution sol = new Solution();
            ListNode head = new ListNode(1);
            ListNode ans;

            // List of [ 1, 2, 3, ,4 ,5]
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            ans = sol.middleNode(head);
            System.out.println(ans.val);

        }

    }


