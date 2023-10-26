package collections;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> list = new MyStack<>();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        System.out.println("list = " + list);

        System.out.println("first element in stack= " + list.peek());

        System.out.println("list size = " + list.size());
        System.out.println("removed element from stack= " + list.pop());
        System.out.println("list = " + list);

        System.out.println("removed element by index = " + list.remove(0));
        System.out.println("list = " + list);


        list.clear();
        System.out.println("list = " + list);

    }
}
