package Lesson28.Lesson28_7;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, String> function = d -> {
            String result ="";

            if (d < 0) {
                result = "Отрицательное число";
            }
            if (d == 0) {
                result = "Ноль";
            }
            if (d > 0) {
                result = "Положительное число";
            }
            return result;
        };

        System.out.println(function.apply(12.1));
        System.out.println(function.apply(0.0));
        System.out.println(function.apply(-3.12));
    }

}
