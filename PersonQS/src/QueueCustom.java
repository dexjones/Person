public class QueueCustom<T> {
    private Node<T> front, rear;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    // Constructor
    public QueueCustom() {
        front = rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }
    // Convert the queue to an array
    public T[] toArray(T[] a) {
        int index = 0;
        Node<T> current = front;
        while (current != null) {
            a[index++] = current.data;
            current = current.next;
        }
        return a;
    }

    // Rebuild the queue from an array
    public void fromArray(T[] array) {
        clear();
        for (T item : array) {
            enqueue(item);
        }
    }

    // Clear the queue
    public void clear() {
        front = rear = null;
        size = 0;
    }

    // Display the queue contents
    public void displayQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
