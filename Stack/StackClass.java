// A Stack is a linear data structure that follows LIFO:

// LIFO = Last In, First Out
// This means the last element added is the first element removed.

// Main operations
// push() → Add an element on top = O(1)
// pop() → Remove the top element = O(1)
// peek() → See the top element without removing it = O(1)

// Implementation in
// Array -fixed size
// ArrayList - variable
// LinkedList - variable



public class StackClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        // add element at the top
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // delete element and returns it
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek check the top element
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }


    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // print the stack
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}