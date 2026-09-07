// Q: Remove Nth Node from End of Linked List

/**
 * Defination of Singly-linked list.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class Question1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }

        // size
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if(n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;



    }
    // print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list 1->2->3->4->5-> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Before:");
        printList(head);

        // Remove 2nd node from end
        int n = 2;

        Question1 obj = new Question1();

        head = obj.removeNthFromEnd(head, n);

        System.out.println("After:");
        printList(head);



    }
}