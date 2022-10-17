package Lesson36.Lesson36_1;

import java.io.*;

public class deserializeMethod {
    public static void deserealizeIt(Horse horse){
        try {
            FileInputStream fis = new FileInputStream("src\\io\\horses.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            horse = (Horse) ois.readObject();

            System.out.println(horse+"\n");

            ois.close();
            System.out.println("Десериализация прошла успешно!\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
