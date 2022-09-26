package Lesson23.Lesson23_9;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }


    public static void main(String[] args) {
        System.out.println(Calculator.sum(2, 3.4));

        System.out.println(Calculator.multiply(5.0, 7.0));

        System.out.println(Calculator.divide(10, 2));

        System.out.println(Calculator.subtraction(20, 13));


    }
}
