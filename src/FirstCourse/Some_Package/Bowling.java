package FirstCourse.Some_Package;
import java.util.*;

public class Bowling {
  HashMap<String, Integer> players;
  Bowling() {
    players = new HashMap<String, Integer>();
  }
  public void addPlayer(String name, int p) {
    players.put(name, p);
  }

  public void getWinner(HashMap players) {
    int max = 0;
    Set<String> keys = players.keySet();
    ArrayList<Integer> values = new ArrayList<>(players.values());

    for (Integer k:values) {
      if (k > max) {
        max = k;
      }
    }
    players.get(keys);
  }
//введите код сюда

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
    game.getWinner(game.players);
  }
}
