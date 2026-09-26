// A Queue is a linear data structure that follows the FIFO (First In, First Out) principle, where the element inserted first is the first element to be removed. 
// Add = Insertion happens from the Rear → called Enqueue
// Remove = Deletion happens from the Front → called Dequeue
// Get = Get the elemet from front → called Peek
// In one line
// Queue = FIFO → First In, First Out
// Front is first element and fixed while Rear will be last if only one element is there [1] then both front and rare will same.

// Implementation 

// Arrays = fixed size

public class QueueY {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add = enqueue
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove = dequeue O(n)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek = get
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }       
}
