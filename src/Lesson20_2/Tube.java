package Lesson20_2;

public class Tube implements Instrument{
    int tubeDiameter;

    Tube(int tubeDiameter) {
        this.tubeDiameter = tubeDiameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба " + tubeDiameter + "-го диаметра.");
    }
}
