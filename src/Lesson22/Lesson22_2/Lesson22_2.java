package Lesson22.Lesson22_2;

public class Lesson22_2 {

    public static void stringBuilder(){
        //a
        StringBuilder stringBuilder1 = new StringBuilder().append("3 + 56 = 59\n")
                                                    .append("3 - 56 = -53\n")
                                                    .append("3 * 56 = 168\n");
        System.out.println(stringBuilder1);

        //б
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder1);

        for(int i = 0; i<3; i++){
            int index = stringBuilder2.indexOf("=");
            stringBuilder2 = stringBuilder2.deleteCharAt(index).insert(index, "равно");
        }
        System.out.println(stringBuilder2 + "\n");

        //в
        StringBuilder stringBuilder3 = new StringBuilder(stringBuilder1);

        for(int i = 0; i<3; i++) {
            int index = stringBuilder3.indexOf("=");
            stringBuilder3 = stringBuilder3.replace(index, index+1, "равно");
        }
        System.out.println(stringBuilder3);
    }


    public static void main(String[] args) {
        stringBuilder();
    }
}
