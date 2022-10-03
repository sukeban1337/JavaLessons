package Lesson30.Lesson30_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        String lineOfNumbers = new Scanner(System.in).nextLine();
        String[] strArr = lineOfNumbers.split(" ");

        Set<String> set = new HashSet<String>(Arrays.asList(strArr));
        String[] result = set.toArray(new String[set.size()]);

        for(String element : result){
            System.out.println(element);
        }
    }
}
