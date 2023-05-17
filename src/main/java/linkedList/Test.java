package linkedList;

import java.util.Arrays;

public class Test {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Hello");
//        list.add("World");
//        list.add("Java");
//        list.add("Data");
//        list.add("Structure");
//        System.out.println(list.size());
//        System.out.println(list.indexOf("Java"));
//        list.remove("Hello");
//        list.remove("World");
//        System.out.println(list.isEmpty());
//        System.out.println(list);
//        System.out.println(list.size());
//        list.add("Hello");
//        System.out.println(list);
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
