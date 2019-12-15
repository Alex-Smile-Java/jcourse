package edu.jcourse.apps.notepad;

import edu.jcourse.apps.guessnum.GameResult;
import edu.jcourse.apps.guessnum.LeaderBoard;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
    static final Scanner stringScanner = new Scanner(System.in);
    private static final ArrayList<Record> records = new ArrayList<>();


    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter command");
            String command = stringScanner.next();
            switch (command) {
                case "help":
                    help();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    list();
                    break;
                case "exit":
                    System.out.println("good bye!");
                    return;
                default:
                    System.out.println("error: unknown command");
            }
        }
    }

    static void help() {
        System.out.println("This could be very helpful text");
    }

    static void createRecord() {
        String firstName = askString("first name: ");
        String lastNAME = askString("last name");
        String phone = askString("phone: ");
        String email = askString("email: ");

        Record record = new Record();
        record.setFirstName(firstName);
        record.setLastNAME(lastNAME);
        record.setPhoneNumber(phone);
        record.setEmail(email);
        records.add(record);

        records.add(record);
    }

    static void list() {
        for (Record r : records) {
            System.out.println(r);
        }
    }

    static String askString(String message) {
        System.out.println(message);
        return stringScanner.next();
    }
}






