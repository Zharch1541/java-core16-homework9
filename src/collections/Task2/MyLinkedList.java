package collections.Task2;

public class MyLinkedList <T> {
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

        public T remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Incorrect index");
            }

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

        public Node<T> get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Incorrect index");
            }

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
