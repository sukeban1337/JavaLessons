package Lesson20_1;

public class InterfaceLesson1 {
    public static void main(String[] args) {
        Printable[] printable = new Printable[4];
        printable[0] = new Book("Book1");
        printable[1] = new Magazine("Magazine1");
        printable[2] = new Magazine("Magazine2");
        printable[3] = new Book("Book2");

        for (Printable element : printable) {
            element.print();
        }

        System.out.println();

        Book.printBooks(printable);
        Magazine.printMagazines(printable);

        System.out.println();
    }
}
