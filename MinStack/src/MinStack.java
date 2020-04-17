import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
    List<Integer> valList;
    int min;

    public MinStack() {
        valList = new LinkedList<>();
        min =0;
    }

    public void push(int x) {
        // Add new value to values list
        valList.add(x);
        // Sort the values to obtain minimum
        Collections.sort(valList);

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
