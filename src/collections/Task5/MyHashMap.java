package collections;

public class MyHashMap <K, V> {

    private Node <K, V> [] array;
    private static final int SIZE = 8;

    public MyHashMap() {
        array = new Node[SIZE];
    }

    public static class Node <K, V> {
        private V value;
        private K key;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            Node<K, V> pair = this;
            StringBuilder sb = new StringBuilder();
            while (pair != null) {
                sb.append("pair is " + pair.key + "-" + pair.value);
                pair = pair.next;
            }
            return sb.toString();
        }
    }

        public void put(K key, V value) {
            int hash = key.hashCode() % SIZE;
            Node<K, V> e = array[hash];
            if (e == null) {
                array[hash] = new Node<K, V>(key, value);
            } else {
                while (e.next != null) {  // updating value, when key is already exist
                    if (e.getKey() == key) {
                        e.setValue(value);
                        return;
                    }
                    e = e.next;
                }
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
                e.next = new Node<K, V>(key, value);
            }
        }

        public V get(K key) {
            int hash = key.hashCode() % SIZE;
            Node<K, V> e = array[hash];
            if (e == null) {
                return null;
            }

            while (e != null) {
                if (e.getKey() == key) {
                    return e.getValue();
                }
                e = e.next;
            }
            return null;
        }



        public Node<K, V> remove(K key) {
            int hash = key.hashCode() % SIZE;
            Node<K, V> e = array[hash];

            if (e == null) {
                return null;
            }

            if (e.getKey() == key) {  // removing from the head
                array[hash] = e.next;
                e.next = null;
                return e;
                }
            Node<K, V> prev = e;   // removing from the middle
            e = e.next;
            while (e != null) {
                if (e.getKey() == key) {
                    prev.next = e.next;
                    e.next = null;
                    return e;
                }
            }
            return null;

        }



        public void clear() {
            for (int i = 0; i < array.length; i++) {
                array[i] = null;
            }
        }



        public int size() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            Node<K, V> e = array[i];
            while (e != null) {
                count++;
                e= e.next;
            }
        }
        return count;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (array[i] != null) {
                sb.append(i + " " + array[i] + "\n");
            } else {
                sb.append(i + " " + "null" + "\n");
            }
        }
        return sb.toString();
    }

}


