package Lesson20_4;

public class Necktie extends Clothes implements MansClothes{
    Necktie(String name, Size size, int clothesPrice, String clothesColour) {
        this.name = name;
        clothesSize = size;
        this.clothesPrice = clothesPrice;
        this.clothesColour = clothesColour;

    }

    @Override
    public void dressAMan(Clothes[] allClothes) {

    }
}
