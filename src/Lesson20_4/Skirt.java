package Lesson20_4;

public class Skirt extends Clothes implements WomenClothes{
    Skirt(String name, Size size, int clothesPrice, String clothesColour) {
        this.name = name;
        clothesSize = size;
        this.clothesPrice = clothesPrice;
        this.clothesColour = clothesColour;

    }

    @Override
    public void dressAWoman(Clothes[] allClothes) {

    }
}
