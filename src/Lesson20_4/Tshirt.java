package Lesson20_4;

public class Tshirt extends Clothes implements MansClothes, WomenClothes {
    Tshirt(String name, Size size, int clothesPrice, String clothesColour) {
        this.name = name;
        clothesSize = size;
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
