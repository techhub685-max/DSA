class ArrayCircularQueue {

    int size = 5;
    int front = -1, rear = -1;
    int[] queue = new int[size];

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = x;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
