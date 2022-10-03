package Lesson30.Lesson30_4;

import java.util.Map;
import java.util.Set;

public class Methods {
    public static <K, V> void entrySetMethod(Map<K, V> productHashMap) {
        Set<Map.Entry<K, V>> entry = productHashMap.entrySet();

        for (Map.Entry<K, V> element : entry) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

    public static <K, V> void keySetMethod(Map<K, V> productHashMap) {
        for (K element : productHashMap.keySet()) {
            System.out.println(element + " " + productHashMap.get(element));
        }
    }

    public static <K, V> void valuesMethod(Map<K, V> productHashMap) {
        for (V element : productHashMap.values()) {
            System.out.println(element);
        }
    }
}
