package Lesson28.Lesson28_8;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier supplier = () -> (int)(Math.random()*10);

        System.out.println(supplier.get());
    }
}
