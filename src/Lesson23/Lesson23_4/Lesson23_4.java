package Lesson23.Lesson23_4;

public class Lesson23_4{


    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("printing...");
            }
        };

        printable.print();
    }
}
