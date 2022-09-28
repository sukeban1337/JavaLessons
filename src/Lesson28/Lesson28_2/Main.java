package Lesson28.Lesson28_2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> nullOrNot = (String s) -> s != null;

        System.out.println(nullOrNot.test("test"));
        System.out.println(nullOrNot.test(" "));
        System.out.println(nullOrNot.test(""));
    }
}
