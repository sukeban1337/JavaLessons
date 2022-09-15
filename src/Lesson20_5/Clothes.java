package Lesson20_5;

public class Clothes {
    String clothName;
    ClothesSize size;
    int price;
    String clothColour;

    public Clothes(String clothName, ClothesSize size, int price, String clothColour) {
        this.clothName = clothName;
        this.size = size;
        this.price = price;
        this.clothColour = clothColour;
    }

    public static class Tshirt extends Clothes {
        public Tshirt(String clothName, ClothesSize size, int price, String clothColour) {
            super(clothName, size, price, clothColour);
        }
    }

    public static class Pants extends Clothes {
        public Pants(String clothName, ClothesSize size, int price, String clothColour) {
            super(clothName, size, price, clothColour);
        }
    }

    public static class Skirt extends Clothes {
        public Skirt(String clothName, ClothesSize size, int price, String clothColour) {
            super(clothName, size, price, clothColour);
        }
    }

    public static class Necktie extends Clothes {
        public Necktie(String clothName, ClothesSize size, int price, String clothColour) {
            super(clothName, size, price, clothColour);
        }
    }
}
