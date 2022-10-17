package Lesson36.Lesson36_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMethod {
    public static void serializeIt(Horse horse){
        try {
            FileOutputStream fos = new FileOutputStream("src\\io\\horses.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(horse);

            oos.close();
            System.out.println("Сериализация прошла успешно!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
