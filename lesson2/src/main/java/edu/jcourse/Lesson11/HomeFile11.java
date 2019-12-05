//package edu.jcourse.Lesson11;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class HomeFile11 {
//
//    public static void main(String[] args) {
//        saveFile();
//
//        ArrayList<String> homeArrayList11 = loadHomeArrayList11();
//        printList(homeArrayList11);
//    }
//
//    private static ArrayList<String> loadHomeArrayList11() {
//
//    }
//
//    private static void saveFile() {
//    }
//
//    public static void printList(List<String> homeArrayList11) {
//        for (String s : homeArrayList11);
//        System.out.println();
//
//    }
//
//    public static void HomeFile11() {
//
//        File HomeFile11 = new File("HomeFile11.txt");
//        try (PrintWriter printWriter = new HomeFile11(HomeFile11()) {
//            printWriter.print("Vasja1@apollo.com");
//            printWriter.print("Vasja2@apollo.com");
//            printWriter.print("Vasja3@apollo.com");
//            printWriter.print("Vasja4@apollo.com");
//            printWriter.print("Vasja5@apollo.com");
//            printWriter.print("Kolja1@mail.ru");
//            printWriter.print("Kolja2@mail.ru");
//            printWriter.print("Kolja3@mail.ru");
//            printWriter.print("Kolja4@mail.ru");
//            printWriter.print("Kolja5@mail.ru");
//            printWriter.print("Fedja1@gmail.com");
//            printWriter.print("Fedja2@gmail.com");
//            printWriter.print("Fedja3@gmail.com");
//            printWriter.print("Fedja4@gmail.com");
//            printWriter.print("Fedja5@gmail.com");
//
//            printWriter.println();
//            System.out.println("File was greated");
//        }
//
//        catch (IOException e) {
//            System.out.println("Can't save file");
//        }
//    }
//}
