package Lesson30.Lesson30_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> productHashMap = new HashMap<>();
        productHashMap.put("ToyName1", new Product("ToyName1"));
        productHashMap.put("ToyName2", new Product("ToyName2"));
        productHashMap.put("ToyName3", new Product("ToyName3"));

        Methods.entrySetMethod(productHashMap);
        System.out.println();
        Methods.keySetMethod(productHashMap);
        System.out.println();
        Methods.valuesMethod(productHashMap);
    }
}
