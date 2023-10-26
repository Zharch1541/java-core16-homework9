package collections.Task2;

import collections.Task2.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("OOHH");
        list.add("MY");
        list.add("GOD");
        System.out.println("list = " + list);

        System.out.println("list size= " + list.size());

        System.out.println("element by index = " + list.get(6).value);

        System.out.println("removed element by index = " + list.remove(4));
        System.out.println("list = " + list);

        list.clear();
        System.out.println("list = " + list);
    }
}
