package Lesson22.Lesson22_5;

public class Lesson22_5 {

public static void stringFormat(String surname, String grade, String subject){
    System.out.printf("Студент %15s получил %3s по %10s.", surname, grade, subject);
}

    public static void main(String[] args) {
        String surname = "surname1";
        String grade = "4";
        String subject = "subject1";

        stringFormat(surname, grade, subject);

    }
}
