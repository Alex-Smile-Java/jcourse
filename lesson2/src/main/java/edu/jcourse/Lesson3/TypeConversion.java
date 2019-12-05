package edu.jcourse.Lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class TypeConversion {

    public static void main(String[] args) {
        byte bvar = 10;
        int iVar = bvar * 20;

        long lVar;
        double dvar;

        lVar = 10_000;
        dvar = lVar;
        System.out.println("LVar and DVar: " + lVar + " " + dvar);

        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        System.out.println("x/y:" + x / y);
        i = (int) (x / y);
        System.out.println("x/y: " + i);
        i = 257; // 257
        b = (byte) i;
        System.out.println("b: " + b);

        b = 90;
        ch = (char) b;
        System.out.println("char: " + ch);

        int iChar = 10086;
        ch = (char) iChar;
    }


}
