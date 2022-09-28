package Lesson28.Lesson28_6;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(12.1);
        Consumer consumer = (Box) -> System.out.println("Отгрузили ящик с весом " + heavyBox.getWeigth());
        Consumer andThenMethod = (Box) -> System.out.println("Отправляем ящик с весом " + heavyBox.getWeigth());

        consumer.andThen(andThenMethod).accept(heavyBox);
    }
}
