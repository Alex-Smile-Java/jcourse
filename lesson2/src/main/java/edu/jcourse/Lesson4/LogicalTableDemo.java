package edu.jcourse.Lesson4;

public class LogicalTableDemo {
    public static void main(String[] args) {
        boolean a, b;
        System.out.println("A\t\tB\t\tAND\t\tOR\t\tXOR\t\tNOT");
        a = true;
        b = true;

        System.out.println(a+ "\t" +b+ "\t");

        System.out.println((a & b) + "\t" + (a | b ) + "\t");

        System.out.println((a ^ b ) + "\t" + (!a));

        a = true;
        b = false;

        System.out.println(a + "\t" + b + "\t");
        System.out.println((a & b) + "\t" + (a | b ) + "\t");
        System.out.println((a ^ b ) + "\t" + (!a));

        a = false;
        b = true;

        System.out.println(a + "\t" + b + "\t");
        System.out.println((a & b) + "\t" + (a | b ) + "\t");
        System.out.println((a ^ b ) + "\t" + (!a));

        a = false;
        b = false;

        System.out.println(a + "\t" + b + "\t");
        System.out.println((a & b) + "\t" + (a | b ) + "\t");
        System.out.println((a ^ b ) + "\t" + (!a));
    }

}
