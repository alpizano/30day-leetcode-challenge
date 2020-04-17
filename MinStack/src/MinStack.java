public class MinStack {
    ListNode head;
    ListNode next;
    int val;
    int min;

    public MinStack() {
        //head = new ListNode(0);
        this.val = val;
        this.next = next;
        min = 0;
    }

    public void push(int x) {
        // Pushes val in-front,
        head = new ListNode(x,head);
    }

    public void pop() {
            head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
