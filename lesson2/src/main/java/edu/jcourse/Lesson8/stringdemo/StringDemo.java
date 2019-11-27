package edu.jcourse.Lesson8.stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        String str2 = "Hello Java";
        //String str 3 = new String(str2);
        boolean isEquals = str1.equalsIgnoreCase(str2);
        System.out.println("Is Equals: + isEquals");

        int jIndex = str1.indexOf("J");
       // System.out.println(jIndex);
        String substring = str1.substring(jIndex, str1.length() -2);
        System.out.println(substring.trim());
        System.out.println(str1.contains("Java"));
    }
}
