package Lesson20_1;

public class Book implements Printable{
    String name;

    Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printBooks(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Book) {
                System.out.println(((Book) element).name);
            }
        }
    }
}
