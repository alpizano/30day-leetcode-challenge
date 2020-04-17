class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MinStack {
    ListNode head;
    int min;

    public MinStack() {
        min =0;
    }

    public void push(int x) {
        // track min value
        if(x < min) {
            min = x;
        }

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
        return this.min;
    }

    public void print() {
        for(ListNode cursor=head; cursor != null; cursor=cursor.next) {
            System.out.print(cursor.val + " ");
        }
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Should return -3
        minStack.pop();
        System.out.println(minStack.top()); // Should return 0
        System.out.println(minStack.getMin()); // Should return -2

      //  minStack.print();
    }
}
