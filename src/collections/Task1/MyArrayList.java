package collections.Task1;

import java.util.Arrays;

public class MyArrayList<S> {
    public Object[] array;
    public int size;

    public MyArrayList() {
        this.array = new Object[10];
    }
    public void add(S value) {
        array[size] = value;
        size++;
    }
     public S remove(int index) {
         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Incorrect index");
         }

        S removedValue = (S) array[index];
         for (int i = index; i < size - 1; i++) {
             array[i] = array[i + 1];
         }

         array[size - 1] = null;
         size--;
         return removedValue;
     }

     public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            size--;
        }
     }

     public int size() {
        return size;
     }

     public S get(int index) {
         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Incorrect index");
         }
        return (S) array[index];
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
