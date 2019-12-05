package edu.jcourse.Lesson11;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        saveFile();
        ArrayList<String> results = loadResults();
        printList(results);
    }

    private static void printList(List<String> list) {


    }

    private static void saveFile() {
        File file = new File("simple_file.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Simple Text 1");
            printWriter.print("Simple Text 2");
            printWriter.println("Simple text 3");
            printWriter.println("Simple Text 4");
            printWriter.println();
            printWriter.close();
            System.out.println("File was greated.");
        } catch (IOException e) {
            System.out.println("Can't save file");
        }
    }

    private static void printResult() {
        File file = new File("simple_file.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Can't read file");
        }

    }

    private static ArrayList<String> loadResults() {
        ArrayList<String> results = new ArrayList<>();
        File file = new File("simple_file.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                results.add(line);
            }
        } catch (IOException e) {
            System.out.println("Can't read file.");
        }
        return results;
    }
}