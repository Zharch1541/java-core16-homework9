package collections;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("OOHH");
        list.add("MY");
        list.add("GOD");
        System.out.println("list = " + list);

        System.out.println("list size= " + list.size());

        System.out.println("element by index = " + list.get(1).value);

        System.out.println("removed element by index = " + list.remove(0));
        System.out.println("list = " + list);

        list.clear();
        System.out.println("list = " + list);
    }
}
