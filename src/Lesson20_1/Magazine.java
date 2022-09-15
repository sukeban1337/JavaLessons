package Lesson20_1;

public class Magazine implements Printable{
    String name;

    Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printMagazines(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Magazine) {
                System.out.println(((Magazine) element).name);
            }
        }

    }
}
