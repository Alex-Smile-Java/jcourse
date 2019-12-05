package edu.jcourse.Lesson5;

import java.security.PublicKey;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog() {

    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " says gav gav");
    }
//    public  void  printAge() {
//        System.out.println(age);
//    }
}
