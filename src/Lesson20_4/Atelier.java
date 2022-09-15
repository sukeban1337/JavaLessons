package Lesson20_4;

public class Atelier extends  Clothes implements MansClothes, WomenClothes{
    @Override
    public void dressAMan(Clothes[] allClothes) {
        int count =1;
        for (Clothes element : allClothes) {
            if (element instanceof MansClothes) {
                System.out.println(count + ". " + element.name + ", размер: " + element.clothesSize + "/" + element.clothesSize.getEuroSize() + "(" + element.clothesSize.getDescription() + "), цена:  " + element.clothesPrice + ", цвет: " + element.clothesColour);
                count++;
            }
        }
        System.out.println();
    }

    @Override
    public void dressAWoman(Clothes[] allClothes) {
        int count =1;
        for (Clothes element : allClothes) {
            if (element instanceof WomenClothes) {
                System.out.println(count + ". " + element.name + ", размер: " + element.clothesSize + "/" + element.clothesSize.getEuroSize() + "(" + element.clothesSize.getDescription() + "), цена:  " + element.clothesPrice + ", цвет: " + element.clothesColour);
                count++;
            }
        }
        System.out.println();
    }
}
