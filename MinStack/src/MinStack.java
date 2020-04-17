public class MinStack {
    ListNode head;
    ListNode top;
    int val;
    int min;

    public MinStack(int val, ListNode next) {
        //head = new ListNode(0);
        this.val = val;
        min = 0;
        top = head;
    }

    public void push(int x) {
        head.next.val = x;
    }

    public void pop() {

    }

    public int top() {
        return 0;
    }

    public int getMin() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
