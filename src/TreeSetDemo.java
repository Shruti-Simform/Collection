import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    void display() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(29);
        ts.add(2);
        ts.forEach(s -> System.out.println(s));

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(6);
        ts2.add(2);
        ts2.add(17);
        System.out.print("Traversal through iterator :");
        Iterator<Integer> itr = ts2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
        System.out.print("\n");

        ts.removeAll(ts2);
        System.out.println("TreeSet:" + ts);

        ts.retainAll(ts2);
        System.out.println("TreeSet:" + ts);

        ts.addAll(ts2);
        System.out.println("TreeSet:" + ts);

        ts.remove(8);
        ts.remove(2);
        System.out.println("TreeSet:" + ts);
    }
}
