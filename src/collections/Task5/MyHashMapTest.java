package collections;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> list = new MyHashMap<>();
        list.put(2, "Coca");
        list.put(4, "Cola");
        list.put(0, "Sprite");
        System.out.println(list);

        System.out.println("value by key = " + list.get(4));
        System.out.println("removed pair = " + list.remove(2));

        System.out.println(list);

        list.put(4, "Fanta");
        System.out.println(list);

        System.out.println("list size= " + list.size());
        list.clear();
        System.out.println(list);

    }
}
