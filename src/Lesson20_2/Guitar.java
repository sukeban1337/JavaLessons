package Lesson20_2;

public class Guitar implements Instrument{
    int guitarStrings;

    Guitar(int guitarStrings) {
        this.guitarStrings = guitarStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + guitarStrings + "-ю струнами.");
    }
}
