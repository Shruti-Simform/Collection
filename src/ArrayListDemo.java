import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    void display() {
        ArrayList<String> al = new ArrayList<>();
        al.add("Mango");
        al.add("Apple");
        al.add("Grapes");
        al.forEach(s -> System.out.println(s));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Kiwi");
        al2.add("Pomegranate");

        al.addAll(al2);
        System.out.println("Traversal through Iterator: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
        System.out.print("\n");

        al.add(2, "Orange");
        System.out.println("ArrayList : " + al);

        al.set(1, "Pineapple");
        System.out.println("ArrayList : " + al);

        al.remove("Kiwi");
        al.remove(3);
        System.out.println("ArrayList : " + al);

        Collections.sort(al);
        System.out.println("ArrayList : " + al);
        Collections.reverse(al);
        System.out.println("ArrayList : " + al);

        System.out.println("Element at index 3 : " + al.get(3));
        System.out.println("Size : " + al.size());
        System.out.println("List contains Apple : " + al.contains("Apple"));
        System.out.println("List contains Apple at index " + al.indexOf("Apple") + " and Pineapple at index " + al.indexOf("Pineapple"));
        System.out.println("Is list empty ? " + al.isEmpty());
        al.clear();
        System.out.println("ArrayList : " + al);
    }
}
