package edu.jcourse.apps.notepad;

import java.util.Scanner;

public class Notepad {
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter command");

            String command = stringScanner.next();
            if (command.equals("help")) help();
        }
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


    }

    static String askString(String message) {
        System.out.println(message);
        return stringScanner.next();
    }


    static void help() {
        System.out.println("This could be very helpful text");
    }

}



