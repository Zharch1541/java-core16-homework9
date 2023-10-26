package collections.Task1;

import collections.Task1.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> mylist = new MyArrayList<>();
        mylist.add("Banana");
        System.out.println("mylist = " + mylist);

        mylist.add("Apple");
        mylist.add("Pear");
        mylist.add("Potato");
        System.out.println("mylist = " + mylist);

        System.out.println("list size = " + mylist.size());
        System.out.println("element by index = " + mylist.get(2));

        System.out.println("removed element by index = " + mylist.remove(20));
        System.out.println("mylist = " + mylist);

        mylist.clear();
        System.out.println("mylist = " + mylist);

    }
}
