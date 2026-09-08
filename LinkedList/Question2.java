// Palindrome

// Stratagy
// 1. Take middle of LL
// 2. Reverse the second half
// 3. Compare 1st and 2nd half if equal then its palindrome

// to detect loop is present or not in linked list we can use 
// 1. Floyd's Algorithim
// 2. Hare Turtle medthod

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

class Question2 {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            // System.out.println("Linked list is Palindrome");
            return true;
        }

        ListNode middle = findMiddle(head); // first half end means second half start
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null) {
            if(firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    // call the function
    public static void main(String[] args) {
        // create linked list 1->2->2->1->null;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        System.out.println();

        Question2 obj = new Question2();
        boolean result = obj.isPalindrome(head);

        System.out.println("Is Palindrome: " + result);

    }
}