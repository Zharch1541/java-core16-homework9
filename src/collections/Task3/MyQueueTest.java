package collections;

public class MyQueueTest {
    public static void main(String[] args) {
    MyQueue<String> list = new MyQueue<>();

    list.add("neck");
    list.add("arm");
    list.add("leg");
    list.add("nose");
        System.out.println("list = " + list);

        System.out.println("first element of queque = " + list.peek());
        System.out.println("list size = " + list.size());

        System.out.println("removed element from queque = " + list.poll());
        System.out.println("list = " + list);

        list.clear();
        System.out.println("list = " + list);
    }
}
