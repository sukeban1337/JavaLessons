package Lesson20_4;

public class Pants extends Clothes implements MansClothes, WomenClothes{
    Pants(String name, Size size, int clothesPrice, String clothesColour) {
        this.name = name;
        this.clothesSize = size;
        this.clothesPrice = clothesPrice;
        this.clothesColour = clothesColour;

    }

    @Override
    public void dressAMan(Clothes[] allClothes) {

    }

    @Override
    public void dressAWoman(Clothes[] allClothes) {

    }
}
