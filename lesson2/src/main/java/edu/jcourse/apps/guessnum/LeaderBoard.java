package edu.jcourse.apps.guessnum;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LeaderBoard {

    private final ArrayList<GameResult> leaderBoard = new ArrayList<>();
    private final File file = new File("leaderBoard.txt");

    public void add(GameResult result) {
        leaderBoard.add(result);
    }

    public void print() {
        System.out.println("Лидеры Попытки Время");
        leaderBoard.sort(Comparator.comparingInt(GameResult::getTriesCount)
        .thenComparingLong(GameResult::getGameTime));

        for (int i = 0; i < Math.min(5, leaderBoard.size()); i++) {
            GameResult n = leaderBoard.get(i);
            System.out.println(n.getName() + n.getTriesCount() + n.getGameTime() / 1000);
        }
    }

    public void save() {

        try (PrintWriter out = new PrintWriter(file)) {
          for (GameResult result : leaderBoard) {
              out.println(result);
          }
        } catch (IOException e) {
            System.out.println("Cannot save leader board, sorry");

        }
    }
    public void load () {
       try (Scanner in = new Scanner(file)){

           while (in.hasNext()) {
               String name = in.next();
               int triesCount = in.nextInt();
               long time = in.nextInt();

               GameResult result = new GameResult();
               result.setName(name);
               result.setTriesCount(triesCount);
               result.setGameTime(time);

               leaderBoard.add(result);
           }
       }catch (IOException e ) {
           System.out.println("Cannot load leader board, sorry");
       }
    }
}

