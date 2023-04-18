import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    void display() {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "Apple");
        tm.put(1, "Pineapple");
        tm.put(9, "Orange");
        tm.put(7, "Kiwi");
        tm.put(2, "Banana");
        tm.forEach((key, value) -> System.out.println(key + " " + value));

        TreeMap<Integer, String> tm2 = new TreeMap<>();
        tm2.put(3, "Apple");
        tm2.put(1, "Strawberry");
        tm2.put(4, "Grapes");
        for (Map.Entry m : tm2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        tm.putAll(tm2);
        System.out.println("TreeMap:" + tm);

        tm.replace(2, "Pineapple");
        tm.remove(3);
        tm.remove(10, "Mango");
        System.out.println("TreeMap:" + tm);

        System.out.println("headMap:" + tm.headMap(3, true));
        System.out.println("tailMap:" + tm.tailMap(3, true));
        System.out.println("subMap:" + tm.subMap(2, false, 7, true));
    }
}
