package Lesson30.Lesson30_5;

import java.util.List;


public class Methods {
    public static void banishmentStudent(List<Student> students, List<Student> result){
        for(int i = 0; i < students.size(); i++){
            double averageGrade = 0;
            for(int j = 0; j < students.get(i).getGrades().length; j++){
                averageGrade += students.get(i).getGrades()[j];
            }

            averageGrade = averageGrade / students.get(i).getGrades().length;

            if(averageGrade > 3){
                students.get(i).setCourse(students.get(i).getCourse()+1);
                result.add(students.get(i));
            }
        }
    }

    public static void printStudents(List<Student> result, int scan){
        for (int i = 0; i < result.size(); i++){
            if(result.get(i).getCourse() == scan){
                System.out.println("Имя: " + result.get(i).getName());
            }
        }
    }
}
