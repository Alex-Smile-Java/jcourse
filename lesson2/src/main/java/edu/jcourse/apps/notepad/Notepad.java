package edu.jcourse.apps.notepad;

import edu.jcourse.apps.guessnum.GameResult;
import edu.jcourse.apps.guessnum.LeaderBoard;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/*
Все делать самостоятельно:
step 1:
    command loop - это бесконечный цикл
    в нем у пользователья запрашивается команда;
    при помощи switch-case вызывается метод для выполнения
    этой команды
    Сделать команды:
        -- exit
        -- help
    Пример запуска:
        enter command> help
        this is very helpful manual....
        enter command> help
        this is very helpful manual....
        enter command> exit
        good bye!
step 2:
    создать класс Record в котором будут объявлены свойства:
        -- firstName (имя персоны)
        -- lastName (фамилия)
        -- phoneNumber (номер телефона)
        -- email (емейл)
    (подсказка: смотреть guessnum.GameResult)
step 3:
    Добавить новую команду "create" для выполнения которой,
    будет вызываться метод createRecord()
step 4:
    в createRecord опросить пользователя - собрать все данные для
    record (имя, фамилия, и т.д.)
    создать новый объект класса Record и наполнить его введенными данными
step 5:
    Объявить переменную для хранения списка рекордов - records - ArrayList
    сохранить созданный рекорд в методе createMethod в этот список
step 6:
    Новая команда - list - печатает на экран все имеющиеся рекорды
step 7:
step 7: Новая тема
    Статические переменные - автоматический подсчет айдишек для рекорда
    см Record id и counter
    Конструктор - см Record()
 */
public class Notepad {
    public static  final  String STR_TIME_PATTERN = "HH:mm";
    public static final DateTimeFormatter TIME_PATTERN
            = DateTimeFormatter.ofPattern(STR_TIME_PATTERN);

    public  static final  String STR_DATE_PATTERN = "yyyy.MM.dd";
    public  static final DateTimeFormatter DATE_PATTERN
            = DateTimeFormatter.ofPattern(STR_DATE_PATTERN);


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
                    System.out.println("Good bye!");
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
        String type = askString("enter type: ");
        switch (type) {
            case "person":
                create(new PersonRecord());
                break;
            case "note":
                create(new NoteRecord());
                break;
            case "shoes":
                create(new ShoesRecord());
                break;
                case "alarm":
                create(new AlarmRecords());
                break;
                case "reminder":
                create(new ReminderRecord());
                break;
            default:
                System.out.println("error: unknown type");
        }
    }

    private static void create(Record aRecord) {
        aRecord.askData();
        records.add(aRecord);
    }


//    static void createNote() {
//       NoteRecord record = new NoteRecord();
//        record.askData ();
//
//        records.add(record);
//    }
//
//
//    static void createPerson() {
//        PersonRecord record = new PersonRecord();
//        record.askData ();
//
//        records.add(record);
//
//    }

    static void list() {
        for (Record r : records) {
            System.out.println(r);
        }
    }

    static String askString(String message) {
        System.out.println(message);
        return stringScanner.next();
    }

    static int askInt(String message) {
        System.out.println(message);
        return stringScanner.nextInt();
    }

    public static LocalTime askTime(String message) {
        String strTime = askString(message + " " + STR_TIME_PATTERN + " ");

//        LocalTime time = LocalTime.parse(strTime, TIME_PATTERN);
//        return time;
        return LocalTime.parse(strTime, TIME_PATTERN);
    }

    public static LocalDate askDate(String d) {
        String strDate = askString(d + " " + STR_DATE_PATTERN + " ");

        LocalDate date = LocalDate.parse(strDate, DATE_PATTERN);

         return date;

    }
}






