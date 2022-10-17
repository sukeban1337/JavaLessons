package Lesson36.Lesson36_1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dir = new File("src\\io");
        dir.mkdir();

        Horse horse = new Horse("Horse");

        SerializeMethod.serializeIt(horse);
        deserializeMethod.deserealizeIt(horse);

    }
}
