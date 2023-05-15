package collections;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Pitha");
        hashSet.add("Jarun");
        hashSet.add("Srettha");
        hashSet.add("Prayut");
        hashSet.add("Narong");
        System.out.println(hashSet);
        System.out.println();

        hashSet.remove("Narong");
        hashSet.forEach(System.out::println);
        System.out.println();

        hashSet.add("Prayut");


        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedHashSet<String> tree = new LinkedHashSet<>();
        tree.add("Pitha");
        tree.add("Jarun");
        tree.add("Srettha");
        tree.add("Prayut");
        tree.add("Narong");
        System.out.println();
        System.out.println(tree);
    }
}




