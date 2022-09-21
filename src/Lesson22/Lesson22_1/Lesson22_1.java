package Lesson22.Lesson22_1;

public class Lesson22_1 {
    public static String anyString = "I like Java!!!";
    public static void anyStringMethod(String anyString){
        //б
        int length = anyString.length() - 1;
        char lastChar = anyString.charAt(length);
        System.out.println("Последний символ строки: '" + lastChar + "'\n");

        //в
        if(anyString.endsWith("!!!")) {
            System.out.println("Строка: '" + anyString + "' заканчивается на '!!!'\n");
        } else System.out.println("Строка: '" + anyString + "' не заканчивается на '!!!'\n");

        //г
        if(anyString.startsWith("I like")) {
            System.out.println("Строка: '" + anyString + "' начинается с 'I like'\n");
        } else System.out.println("Строка: '" + anyString + "' не начинается с 'I like'\n");

        //д
        if(anyString.contains("Java")) {
            System.out.println("Строка: '" + anyString + "' содержит 'Java'\n");
        } else System.out.println("Строка: '" + anyString + "' не содержит 'Java'\n");

        //e
        int index = anyString.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + index + "\n");

        //ж
        String string1 = anyString.replaceAll("a", "o");
        System.out.println(string1 + "\n");

        //з
        String string2 = anyString.toUpperCase();
        System.out.println(string2 + "\n");

        //и
        String string3 = anyString.toLowerCase();
        System.out.println(string3 + "\n");

        //к
        String string4 = anyString.substring(7, 11);
        System.out.println(string4 + "\n");

    }

    public static void main(String[] args) {
        anyStringMethod(anyString);
    }
}
