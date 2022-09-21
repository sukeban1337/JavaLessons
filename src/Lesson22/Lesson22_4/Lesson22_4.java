package Lesson22.Lesson22_4;

import java.util.Arrays;

public class Lesson22_4 {

    public static void middleSymbols(String[] stringArr){
        for(int i = 0; i < stringArr.length; i++){
            int middleIndex = stringArr[i].length() /2;
            String extractSymbols = stringArr[i].substring(middleIndex -1, middleIndex +1);
            stringArr[i] = extractSymbols;
        }
        System.out.println(Arrays.toString(stringArr));
    }

    public static void main(String[] args) {
        String[] stringArr = {"string", "code", "practice"};
        middleSymbols(stringArr);

    }

}
