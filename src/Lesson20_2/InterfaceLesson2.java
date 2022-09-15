package Lesson20_2;

public class InterfaceLesson2 {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[3];
        instrument[0] = new Guitar(6);
        instrument[1] = new Drums(16);
        instrument[2] = new Tube(27);

        for (Instrument element : instrument) {
            element.play();
        }
        System.out.println();
    }
}
