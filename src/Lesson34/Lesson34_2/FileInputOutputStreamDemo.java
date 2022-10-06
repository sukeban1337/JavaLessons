package Lesson34.Lesson34_2;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        File dir = new File("src\\io");
        dir.mkdir();

        try(
                OutputStream output = new FileOutputStream("src\\io\\file.txt");
                InputStream input = new FileInputStream("src\\io\\file.txt")
                ) {

            char[] symbols = {'a', 'b', 'c'};

            for (char element : symbols) {
            // Запись каждого символа в текстовый файл
                output.write(element);
            }
            output.close();

            int size = input.available();
            for (int i = 0; i < size; i++) {
            // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
