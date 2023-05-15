package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List{
    public static void main(String[] args) {
        long start = System.nanoTime();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");
        linkedList.add("six");

        for (int i = 5; i <= linkedList.size() + 1; i--) {
            if (i >= 0) {
                System.out.println(linkedList + " last element is " + linkedList.get(i));
                linkedList.remove(i);
            } else if (i == -1) {
                System.out.println(linkedList + " is empty");
            } else
                break;
        }
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " nanoseconds");
    }
}



