package Lesson36.Lesson36_3;

import Lesson36.Lesson36_1.Horse;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MetadataMethod {
    public static void getData() {
        Class<?> c1 = null;

        try {
            c1 = Horse.class;

            System.out.println("Class name: " + c1.getName());
            System.out.println("Class simple name: " + c1.getSimpleName());

            System.out.println("----------");

            System.out.println("Name of the super class is: " + c1.getSuperclass());

            System.out.println("----------");

            System.out.println("Interfaces: " + Arrays.toString(c1.getInterfaces()));

            System.out.println("----------");

            Field[] allFields = c1.getFields();
            System.out.println("All fields: " + Arrays.toString(allFields));

            Field[] fields = c1.getDeclaredFields();
            System.out.println("Fields: " + Arrays.toString(fields));

            System.out.println("----------");

            Constructor<?>[] constructors = c1.getConstructors();
            System.out.println("Constructors: " + Arrays.toString(constructors));

            Constructor<?>[] declarConstructors = c1.getDeclaredConstructors();
            System.out.println("Declared constructors: " + Arrays.toString(declarConstructors));

            System.out.println("----------");

            Method[] methods = c1.getMethods();
            System.out.println("All methods: " + Arrays.toString(methods));

            Method[] declarMethods = c1.getDeclaredMethods();
            System.out.println("Class methods: " + Arrays.toString(declarMethods));

            System.out.println("----------");

            Annotation[] annotations = c1.getAnnotations();
            System.out.println("Annotations: " + Arrays.toString(annotations));

            Annotation[] declarAnnotations = c1.getDeclaredAnnotations();
            System.out.println("Declared annotations: " + Arrays.toString(declarAnnotations));








        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
