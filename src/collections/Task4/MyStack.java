package collections;

public class MyStack <T> {
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

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first= last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    public T remove(int index) {
        T removedValue = null;
        if(index == 0) {
            removedValue = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prev = get(index - 1);
            T value = prev.next.value;
            prev.next = prev.next.next;
        }
        size--;
        return removedValue;
    }
    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }
    public T peek() {
        return last.value;
    }

    public T pop() {
        T value= last.value;
        if (first == last) {
            first = last = null;
        } else {
            Node<T> current = first;
            while (current.next != last) {
                current = current.next;
            }
            last = current;
            last.next = null;
        }
        size--;
        return value;
    }

    public Node<T> get(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
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
