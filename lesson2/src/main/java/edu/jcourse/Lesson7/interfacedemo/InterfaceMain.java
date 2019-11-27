package edu.jcourse.Lesson7.interfacedemo;

public class InterfaceMain {

    public static void main(String[] args) {
       Myinterface myInterface1 = new MyinterfaceImpl();

       Myinterface myInterface2 = new MyInterfaceimpl2();

        System.out.println(myInterface1.calculateDistance());
        System.out.println(myInterface2.calculateDistance());

    }

}
