package Lesson20_2;

public class Drums implements Instrument{
    int drumsSize;

    Drums(int drumsSize) {
        this.drumsSize = drumsSize;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны " + drumsSize + "-го размера.");
    }
}
