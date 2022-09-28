package Lesson28.Lesson28_1;

public class Main {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Printing...");
        printable.print();
    }
}
