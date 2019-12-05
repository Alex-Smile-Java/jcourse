package edu.jcourse.Lesson3;

public class ArrrayTask2 {
    public static void main(String[] args) {
//        int arraySize = 11;
//        int a[] = new int[arraySize];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i * 7;
//        }
//
//        for (int i = 0; i < a.length ; i++) {
//
//            if (i == 11) {
//                break;
//            }
//            System.out.println(a[i]);
        int arraySize = 10;
        float elements[] = new float[arraySize];

        float sum = 0;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = (i + 1) * 7;
            sum += elements[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Elements: " + elements.length);
        System.out.println("Average: " + sum/elements.length);
    }

    }