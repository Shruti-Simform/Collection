import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    void display() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Apple");
        hm.put(1, "Apple");
        hm.put(2, "Pineapple");
        hm.put(9, "Orange");
        hm.put(5, "Kiwi");
        hm.put(3, "Grapes");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(2, "Mango");
        hm2.put(6, "Banana");
        hm2.put(4, "Tomato");
        System.out.println("Traversal through Map.Entry :");
        for (Map.Entry m : hm2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putAll(hm2);
        System.out.println("HashMap:" + hm);

        hm.replace(2, "Mango", "Pineapple");
        System.out.println("HashMap:" + hm);

        hm.remove(3);
        hm.remove(9, "Orange");
        System.out.println("HashMap:" + hm);
    }
}
