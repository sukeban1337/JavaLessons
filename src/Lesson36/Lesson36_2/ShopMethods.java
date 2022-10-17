package Lesson36.Lesson36_2;


import java.io.*;
import java.util.List;
import java.util.Scanner;

import static Lesson36.Lesson36_2.ClothCart.clothCart;
import static Lesson36.Lesson36_2.ClothCatalog.clothCatalog;

public class ShopMethods {

    public static void getStart(){
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
        System.out.println("\n<Меню>");
        System.out.println("1. Каталог");
        System.out.println("2. Корзина");
        System.out.println("3. Оплата");
        System.out.println("0. Выход");

        Scanner menuScanner = new Scanner(System.in);
        int menuChoice = menuScanner.nextInt();
        switch(menuChoice) {
            case 1:
                getCatalog();
                break;
            case 2:
                getCart();
                break;
            case 3:
                getPayment();
                break;
            case 0:
                break;
        }
    }


    public static void getCatalog(){
        System.out.println("<Каталог>");
        for(int i = 0; i < clothCatalog.size(); i++) System.out.println((i+1) + ". " + clothCatalog.get(i).getName() + ", " + clothCatalog.get(i).getSize() + ", " + clothCatalog.get(i).getColour() + ", " + clothCatalog.get(i).getPrice());
        System.out.println("0. Назад");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 0)getMenu();
        else if(number <= clothCatalog.size()){
         clothCart.add(clothCatalog.get(number - 1));
         getCatalog();
        }
    }

    public static void getCart(){
        System.out.println("<Ваша корзина>");
        for(int i = 0; i < clothCart.size(); i++) System.out.println((i+1) + ". " + clothCart.get(i).getName() + ", " + clothCart.get(i).getSize() + ", " + clothCart.get(i).getColour() + ", " + clothCart.get(i).getPrice());
        System.out.println("----------\n 0. Назад\n 1. Оплатить покупки");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 0)getMenu();
        else if(number == 1) getPayment();
    }

    public static void getPayment(){
        System.out.println("<Товарный чек>");
        for(int i = 0; i < clothCart.size(); i++) System.out.println((i+1) + ". " + clothCart.get(i).getName() + ", " + clothCart.get(i).getSize() + ", " + clothCart.get(i).getColour() + ", " + clothCart.get(i).getPrice());
        System.out.println("----------\nСохранить чек?\n0. Да(сериализация)\n1. Нет");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 0){
            getSerialize();
            System.out.println("Чек успешно сохранён.\nЖелаете просмотреть чек?\n0. Да(десериализация)\n1. Нет");

            Scanner sc1 = new Scanner(System.in);
            int number1 = sc.nextInt();

            if(number1 == 0){
                getDeserialize();
            }
        } else if(number == 1) System.out.println("До свидания!");
        else if(number == 1) System.out.println("До свидания!");

    }

    public static void getSerialize(){
        File dir = new File("src\\io");
        dir.mkdir();

        try {
            FileOutputStream fos = new FileOutputStream("src\\io\\ClothesCart.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(clothCart);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getDeserialize(){

        try {
            FileInputStream fis = new FileInputStream("src\\io\\ClothesCart.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<ClothesExample> clothCheck = (List) ois.readObject();

            System.out.println("<Товарный чек>");
            for(int i = 0; i < clothCheck.size(); i++) System.out.println((i+1) + ". " + clothCheck.get(i).getName() + ", " + clothCheck.get(i).getSize() + ", " + clothCheck.get(i).getColour() + ", " + clothCheck.get(i).getPrice());

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
