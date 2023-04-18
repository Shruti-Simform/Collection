import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    void display() {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Apple");
        hs.add("Grapes");
        hs.add("Orange");
        hs.add("Pineapple");
        hs.forEach(s -> System.out.println(s));

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Kiwi");
        hs1.add("Pomegranate");
        hs1.add("Apple");

        hs.addAll(hs1);
        System.out.print("Traversal through iterator : ");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
        System.out.print("\n");

        hs.removeAll(hs1);
        System.out.println("HashSet : " + hs);

        hs.remove("Grapes");
        System.out.println("HastSet : " + hs);

        System.out.println("Hashset contains Apple : " + hs.contains("Apple"));

        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Apple");
        hs2.add("Orange");
        hs.retainAll(hs2);
        System.out.println("HashSet : " + hs);

        hs.clear();
        System.out.println("HashSet : " + hs);
    }

}
