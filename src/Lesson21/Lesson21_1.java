package Lesson21;

public class Lesson21_1 {
    public static void main(String[] args) {
        //a)
        Double double1 = Double.valueOf("12.3");

        //б)
        String string1 = "3.21";
        double d1 = Double.parseDouble(string1);

        //в)
        Double d2 = new Double("123.45");
        double d3 = d2.doubleValue();
        int i1 = d2.intValue();
        byte b1 = d2.byteValue();
        long l1 = d2.longValue();
        float f1 = d2.floatValue();
        String s1 = "" + d2;

        //г
        System.out.println(d2);
        System.out.println(d3 + " " + i1 + " " + b1 + " " + l1 + " " + f1 + " " + s1);

        /* д)
        "д) Преобразовать литерал типа double к строке: String d = Double.toString(3.14);"
        Не совсем понял, разве "String d = Double.toString(3.14);" не является решением этой задачи?
         */
        String d = Double.toString(3.14);
        System.out.println(d);

        //если нет, то:
        double d4 = 3.14;
        String s2 = "" + d4;
        System.out.println(d4);

    }
}
