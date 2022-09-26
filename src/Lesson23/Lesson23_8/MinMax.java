package Lesson23.Lesson23_8;

import java.util.Arrays;

public class MinMax <T extends Comparable>{
    private T[] tArray;

    public T[] gettArray() {
        return tArray;
    }

    public MinMax(T[] tArray) {
        this.tArray = tArray;
    }

    public void minElement(T[] tArray){
        T min = tArray[0];
        for(T t : tArray){
            if(t.compareTo(min) < 0){
                min = t;
            }
        }
        System.out.println(min);
    }

    public void maxElement(T[] tArray){
        T max = tArray[0];
        for(T t : tArray){
            if(t.compareTo(max) > 0){
                max = t;
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        Double[] doubleArray = {3.0, 1.0, 2.0};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);

        doubleMinMax.minElement(doubleMinMax.tArray);
        doubleMinMax.maxElement(doubleMinMax.tArray);

        Integer[] integerArray = {5, 4 ,6};
        MinMax<Integer> integerMinMax = new MinMax<>(integerArray);

        integerMinMax.minElement(integerMinMax.tArray);
        integerMinMax.maxElement(integerMinMax.tArray);

        MinMax<Character> characterMinMax = new MinMax<>(new Character[]{'g', 't', 'r'});

        characterMinMax.minElement(characterMinMax.tArray);
        characterMinMax.maxElement(characterMinMax.tArray);
    }
}
