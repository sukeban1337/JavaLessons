package Lesson36.Lesson36_2;

import java.util.ArrayList;
import java.util.List;

public class ClothCatalog {
    static List<ClothesExample> clothCatalog = new ArrayList<>(){{
        add(new ClothesExample("Футболка", "S", "Белый", 10));
        add(new ClothesExample("Штаны", "M", "Черный", 20));
        add(new ClothesExample("Куртка","L", "Красный", 30));
    }};
}
