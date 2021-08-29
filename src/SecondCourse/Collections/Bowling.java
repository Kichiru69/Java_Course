package SecondCourse.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Bowling {
  HashMap<String, Integer> players;

  Bowling() {
    players = new HashMap<String, Integer>();
  }

  public void addPlayer(String name, int p) {
    players.put(name, p);
  }

  public void getWinner() {
    Collection<Integer> values = players.values();
    Iterator<Integer> iterator = values.iterator();
    int maxValue = 0;
    while (iterator.hasNext()) {
      int i = iterator.next();
      if (i > maxValue) {
        maxValue = i;
      }
    }
    Collection<String> key = players.keySet();
    for (String s : key) {
      if (players.get(s) == maxValue) {
        System.out.println(s);
      }
    }
  }
//введите код сюда

}

class Program {
  public static void main(String[] args) {
    Bowling game = new Bowling();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      String input = sc.nextLine();
      String[] values = input.split(" ");
      String name = values[0];
      int points = Integer.parseInt(values[1]);
      game.addPlayer(name, points);
    }
    game.getWinner();
  }
}

//A 150
//B 222
//C 11