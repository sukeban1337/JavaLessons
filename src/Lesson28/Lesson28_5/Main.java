package Lesson28.Lesson28_5;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = (String s) ->
             s.startsWith("N") && s.endsWith("A") || s.startsWith("J") && s.endsWith("A");



        System.out.println(predicate.test("NA"));
        System.out.println(predicate.test("na"));
        System.out.println(predicate.test("JA"));
        System.out.println(predicate.test("Ja"));
    }

}
