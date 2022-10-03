package Lesson30.Lesson30_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Name1", "Group1", (int) (Math.random() * 4) + 1, new long[]{(int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1}));
        students.add(new Student("Name2", "Group2", (int) (Math.random() * 4) + 1, new long[]{(int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1}));
        students.add(new Student("Name3", "Group3", (int) (Math.random() * 4) + 1, new long[]{(int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1}));
        students.add(new Student("Name4", "Group4", (int) (Math.random() * 4) + 1, new long[]{(int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1}));
        students.add(new Student("Name5", "Group5", (int) (Math.random() * 4) + 1, new long[]{(int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1, (int) (Math.random() * 5) + 1}));

        List<Student> result = new ArrayList<>();

        System.out.println("Изначальный список студентов:");
        for (Student element : students) {
            System.out.println("Имя: " + element.getName() +
                    " Группа: " + element.getGroup() +
                    " Курс: " + element.getCourse() +
                    " Оценки: " + Arrays.toString(element.getGrades()));

        }

        Methods.banishmentStudent(students, result);

        System.out.println();

        System.out.println("Список студентов прошедших на следующий курс:");

        for (Student element : result) {
            System.out.println("Имя: " + element.getName() +
                    " Группа: " + element.getGroup() +
                    " Курс: " + element.getCourse() +
                    " Оценки: " + Arrays.toString(element.getGrades()));


        }
        System.out.println("\nВведите интересующий вас курс:");
        int scan = new Scanner(System.in).nextInt();

        System.out.println("Поиск учеников по заданным параметрам: " + scan + " курс\n.....\n....\n...\n..\n.");
        Methods.printStudents(result, scan);
    }
}
