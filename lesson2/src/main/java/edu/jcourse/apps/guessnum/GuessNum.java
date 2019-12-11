package edu.jcourse.apps.guessnum;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class GuessNum {

    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.load();

        while (true) {
            int randomInt = random.nextInt(100) + 1;
            System.out.println("Назовите своё имя");
            String name = stringScanner.next();

            long gameStart = System.currentTimeMillis();

              System.out.println(randomInt);

            boolean isLooser = true;
            for (int i = 0; i < 10; i++) {


                int input1 = askNum(i + 1);

                if (input1 < randomInt) System.out.println("Моё число больше");
                if (input1 > randomInt) System.out.println("Моё число меньше");
                if (input1 == randomInt) {

                    long gameEnd = System.currentTimeMillis();
                    long time = gameEnd - gameStart;
                    GameResult res = new GameResult();
                    res.setName(name);
                    res.setTriesCount(i + 1);
                    res.setGameTime(gameEnd - gameStart);
                    leaderBoard.add(res);
                    isLooser = false;

                    System.out.println("Вы угадали");
                    break;
                }
            }

            if (isLooser) {
                System.out.println("Game Over" + randomInt);
            }
            System.out.println("Хотите играть снова? (y/n)");
            String answer = stringScanner.next();
            if (answer.equals("n")) {
                break;
            }
        }
        leaderBoard.print();
        leaderBoard.save();

        System.out.println("Досвидание");
    }

    static int askNum(int tryNr) {
        while (true) {
            try {
                System.out.printf("Try #%d. Введите число ", tryNr);
                int n = stringScanner.nextInt();
                if (n < 0 || n > 100) {
                    System.out.println("Введите число от 1 до 100");
                } else {
                    return n;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Ой, извените, это не число!");
                stringScanner.next();
            }
        }
    }
}
