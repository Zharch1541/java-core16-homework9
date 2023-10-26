package collections;

public class MyQueue<T> {
    private Node<T> last;
    private Node<T> first;
    int size;
    public static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first= last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }
    public T peek() {
        return first.value;
    }
    public T poll() {
        T removedValue = first.value;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return removedValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = first;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
