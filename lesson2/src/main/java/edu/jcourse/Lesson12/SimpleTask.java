package edu.jcourse.Lesson12;

import edu.jcourse.Lesson5.Cat;

import java.util.ArrayList;
import java.util.List;

public class SimpleTask {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassA e = new ClassA();
        a.printMessage();
        e.printMessage();

        ClassB b = new ClassB();
        b.printMessage();

        ClassC c = new ClassC();
        c.printMessage();

        ClassABC abc = new ClassABC();
        abc.printMessage();

        CircleAreaService service = new CircleAreaServiceImpl();
        CircleAreaService area = new CircleAreaServiceImpl();
        CircleAreaService volume = new CircleAreaServiceImpl();

        System.out.println(volume.cubeVolume(20));
        System.out.println(area.calculateArea(0.8F));
        System.out.println(service.rectangleArea(4,5));

        ArrayList<String> names = new ArrayList<>();
        names.add("dzon.grey@abc.com");
        names.add("stiv.job@tre.df");
        names.add("ergo.name@rus.ru");

        FileService fileService = new FileServiceImpl();
        fileService.createFile("file1.txt",names);

    }
}
