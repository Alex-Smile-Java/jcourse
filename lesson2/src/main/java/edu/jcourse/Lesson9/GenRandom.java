package edu.jcourse.Lesson9;

import java.util.Random;

public class GenRandom {
    public static void main(String[] args) {
//   milliseconds from 1970 01 01 00:00
        System.out.println(System.currentTimeMillis());
        Random random = new Random(10);

        for (int i = 0; i < 10; i++){

        int randomInt = random.nextInt(100) + 1 ;

        System.out.println(randomInt);
    }
    }

}
