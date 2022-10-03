package Lesson30.Lesson30_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //а)
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(12.1));
        heavyBoxes.add(new HeavyBox(23.4));
        heavyBoxes.add(new HeavyBox(34.5));


        //б)
        int i = 0;
        for(HeavyBox element : heavyBoxes){
            System.out.println(i + ". " + element + " Вес: " + element.getWeight());
            i++;
        }


        //в)
        heavyBoxes.get(0).setWeight(heavyBoxes.get(0).getWeight() + 1);


        //г)
        heavyBoxes.remove(heavyBoxes.get(heavyBoxes.size() - 1));


        //д)
            //1)
        Object[] heavyBoxes0 = heavyBoxes.toArray();
        System.out.println(Arrays.toString(heavyBoxes0));

            //2)
        HeavyBox[] heavyBoxes1 = new HeavyBox[heavyBoxes.size()];
        heavyBoxes.toArray(heavyBoxes1);
        System.out.println(Arrays.toString(heavyBoxes1));

            //3)
        HeavyBox[] heavyBoxes2 = heavyBoxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(heavyBoxes2));


        //e)
        heavyBoxes.removeAll(heavyBoxes);

    }
}
