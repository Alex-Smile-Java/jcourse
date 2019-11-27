package edu.jcourse.Lesson7.Homework;

public class Student {
    public String name;
    public int age;

    public Student() {


    }



    public String toString() {
        return getName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
