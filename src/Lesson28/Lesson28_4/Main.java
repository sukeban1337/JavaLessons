package Lesson28.Lesson28_4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        Predicate<String> isEmpty = (String s) -> !s.isEmpty();
        Predicate<String> notNull = (String s) -> s != null;

        System.out.println(isEmpty.and(notNull).test("Hello World"));
        System.out.println(isEmpty.and(notNull).test(" "));
        System.out.println(isEmpty.and(notNull).test(null));

    }
}
