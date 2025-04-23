package QUEUES;

public class ImplementationOfCircularQueueToArray {
    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty operation
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Full Condition in Queue
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add Operation in Queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // Add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //  Remove operation
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // Last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek Operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        System.out.println(Queue.remove());
        Queue.add(4);
        System.out.println(Queue.remove());
        Queue.add(5);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }

    }
}
