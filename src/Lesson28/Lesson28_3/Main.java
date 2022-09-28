package Lesson28.Lesson28_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> emptyOrNot = (String s) -> !s.isEmpty();

        System.out.println(emptyOrNot.test("test"));
        System.out.println(emptyOrNot.test(" "));
        System.out.println(emptyOrNot.test(""));
    }
}
