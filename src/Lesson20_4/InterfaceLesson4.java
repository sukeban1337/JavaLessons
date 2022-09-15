package Lesson20_4;

public class InterfaceLesson4 {
    public static void main(String[] args) {
        Clothes[] allClothes = new Clothes[4];
        allClothes[0] = new Tshirt("Футболка", Size.XXS, 100, "Белый");
        allClothes[1] = new Pants("Штаны", Size.L, 200, "Черный");
        allClothes[2] = new Skirt("Юбка", Size.M, 150, "Синий");
        allClothes[3] = new Necktie("Галстук", Size.XS, 75, "Зелёный");

        Atelier atelier = new Atelier();
        atelier.dressAMan(allClothes);
        atelier.dressAWoman(allClothes);
    }
}
