package Lesson30.Lesson30_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> notSortedHeavyBoxes = new ArrayList<>();
        notSortedHeavyBoxes.add(new HeavyBox((int) (Math.random()*600)));
        notSortedHeavyBoxes.add(new HeavyBox((int) (Math.random()*600)));
        notSortedHeavyBoxes.add(new HeavyBox((int) (Math.random()*600)));
        notSortedHeavyBoxes.add(new HeavyBox((int) (Math.random()*600)));
        notSortedHeavyBoxes.add(new HeavyBox((int) (Math.random()*600)));

        List<HeavyBox> sortedHeavyBoxes = new ArrayList<>();

        System.out.println("Массив до сортировки:");
        for(HeavyBox element : notSortedHeavyBoxes){
            System.out.println(element.getWeight());
        }

        System.out.println("\nСортировка...\n");

        BoxSorter sort = new BoxSorter();
        sort.boxSorter(notSortedHeavyBoxes, sortedHeavyBoxes);

        System.out.println("Массив с весом коробок менее 300:");
        for(HeavyBox element : notSortedHeavyBoxes){
            System.out.println(element.getWeight());
        }

        System.out.println("\nМассив с весом коробок более 300:");

        for(HeavyBox element : sortedHeavyBoxes){
            System.out.println(element.getWeight());
        }

    }

}
