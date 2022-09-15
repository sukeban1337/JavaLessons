package Lesson20_5;

import java.util.Scanner;

public class InterfaceLesson5 {
    public static void main(String[] args) {
        customer = new User("","");
        card = new Clothes[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Авторизация \nВведите логин пользователя: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль пользователя: ");
        String password = scanner.nextLine();
        if (login.isEmpty() || password.isEmpty()){
            System.out.println("Вы ввели неправильный логин или пароль.");
        } else System.out.println("Вы успешно авторизировались."); getMenu();
    }

    public static void getMenu(){
        System.out.println("\nМеню:");
        System.out.println("1. Каталог");
        System.out.println("2. Корзина");
        System.out.println("3. Оплата");
        System.out.println("0. Выход");

        Scanner menuScanner = new Scanner(System.in);
        int menuChoice = menuScanner.nextInt();
        switch(menuChoice) {
            case 1:
                getCatalog(all);
                break;
            case 2:
                getBasket(card);
                break;
            case 3:
                Buy();
                break;
            case 0:
                break;
        }
    }
    public static void getCatalog(Catalog[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println((i+1) + ". " + c[i].nameCatalog);
        System.out.println("0. Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);
    }

    public static void seeProduct(Catalog cat) {
        for(int i = 0; i < cat.clothes.length; ++i) {
            System.out.println((i+1) + ". " + cat.clothes[i].clothName + ", размер: " + cat.clothes[i].size + ", стоимость: "
                    + cat.clothes[i].price + ", цвет:  " + cat.clothes[i].clothColour);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCatalog(all);
        else buyProduct(cat.clothes[number-1]);
    }

    private static void buyProduct(Clothes p) {
        System.out.println("Товар " + p.clothName +  " был добавлен в вашу корзину");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                }
            }
        }

        getCatalog(all);
    }

    public static void getBasket(Clothes[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].clothName + ", размер: " + b[i].size + ", стоимость: "
                    + b[i].price + ", цвет:  " + b[i].clothColour);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }

    public static void Buy() {
        Basket cards = new Basket(card);
        customer.purchased = cards;
        System.out.println("Товарный чек");
        for(int i = 0; i < customer.purchased.inBasket.length; ++i) {
            if(customer.purchased.inBasket[i] == null) break;
            System.out.println((i+1) + ". " + customer.purchased.inBasket[i].clothName + ", размер: " + customer.purchased.inBasket[i].size + ", стоимость: "
                    + customer.purchased.inBasket[i].price + ", цвет:  " + customer.purchased.inBasket[i].clothColour);
        }
        double gc = getCash(customer.purchased.inBasket);
        System.out.print("Общая сумма покупок составляет: " + gc);

    }

    public static double getCash(Clothes[] p) {
        int cash = 0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash += p[i].price;
        }
        return cash;
    }

    static Clothes tshirt = new Clothes.Tshirt("Футболка", ClothesSize.S, 100, "Белый");
    static Clothes pants = new Clothes.Pants("Штаны", ClothesSize.L, 200, "Черный");
    static Clothes skirt = new Clothes.Skirt("Юбка", ClothesSize.M, 150, "Синий");
    static Clothes necktie = new Clothes.Necktie("Галстук", ClothesSize.XS, 75, "Зелёный");

    static Clothes[] mansCloth = {tshirt, pants, necktie};
    static Clothes[] womenCloth = {tshirt, pants, skirt};

    static Catalog forMans = new Catalog("Мужская одежда", mansCloth);
    static Catalog forWomens = new Catalog("Женская одежда", womenCloth);
    static Catalog[] all = {forMans, forWomens};
    static Clothes[] card;
    static User customer;


}
