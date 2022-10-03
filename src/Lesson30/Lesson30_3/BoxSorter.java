package Lesson30.Lesson30_3;

import java.util.ArrayList;
import java.util.List;

public class BoxSorter {
    public void boxSorter(List<HeavyBox> notSortedHeavyBoxes, List<HeavyBox> sortedHeavyBoxes){
        for(int i = 0; i<notSortedHeavyBoxes.size(); i++){
            if(notSortedHeavyBoxes.get(i).getWeight() > 300){
                sortedHeavyBoxes.add(notSortedHeavyBoxes.get(i));
                notSortedHeavyBoxes.remove(notSortedHeavyBoxes.get(i));
            }
        }
    }
}
