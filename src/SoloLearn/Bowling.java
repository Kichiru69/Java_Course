package SoloLearn;

import java.util.HashMap;
import java.util.Scanner;

public class Bowling {
  HashMap<String, Integer> players;

  Bowling() {
    players = new HashMap<String, Integer>();
  }

  public void addPlayer(String name, int p) {
    players.put(name, p);
  }

  //введите код сюда
  public void getWinner() {
    int maxValue = Integer.MIN_VALUE;
    for (int value : players.values()) {
      if (value > maxValue) {
        maxValue = value;
      }
      System.out.println(players.get(maxValue));
    }
  }
}

   class Program {
    public static void main(String[ ] args) {
      Bowling game = new Bowling();
      Scanner sc = new Scanner(System.in);

      for(int i=0;i<3;i++) {
        String input = sc.nextLine();
        String[] values = input.split(" ");
        String name = values[0];
        int points = Integer.parseInt(values[1]);
        game.addPlayer(name, points);
      }
      game.getWinner();
    }
  }

