// A LinkedList is a data structure where elements are stored in separate objects called nodes, and each node keeps a reference to the next node.

// Linking different data to each other called LinkedList.
// Variable size (until memory get full)
// Non-contiguous Memory (chunks)
// Insert in O(1)
// Search in O(n)
// first Node of LinkedList is called Head
// there are three types 
// 1. Singular
// 2. Double
// 3. Cirular

// for insertion use LinkedList
// for seaching use ArrayList

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    // public void addLast(String data) { // for String
    public void addLast(int data) {       // for int
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    // print
    public void printList() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // iterative function
    public void reverseIterate() {
        if(head == null || head.next == null) { // (head.next == null) for single node can't reverse.
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update curr, prev and next
            prevNode = currNode;
            currNode = nextNode;

        }

        head.next = null;
        head = prevNode;
    }

    // recursive function
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        // LL list = new LL();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // int size = list.getSize();
        // System.out.println(size);

        // list.addFirst("this");
        // list.printList();
        // System.out.println(list.getSize());

        LL list = new LL();
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        list.printList();

        // list.reverseIterate();

        list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }

}