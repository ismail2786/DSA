/**
 * Defination of a linked list
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Question3 {

    public static boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode hare = head; // fast pointer
        ListNode turtle = head; // slow pointer

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle) {
                return true;
            }
        }

        return false;

    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        if(curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.print("null");



    }

    public static void main(String[] args) {

        // Creating linked list
        ListNode head = new ListNode(1);

        Question3 obj = new Question3();
        boolean result = obj.hasCycle(head);

        System.out.println(result);


        printList(head);

        


    }
}