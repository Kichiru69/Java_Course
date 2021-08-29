package SecondCourse.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
  public static void main(String[] args) {
    Queue<AnimeCharacters> q = new LinkedList<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    q.add(ac);
    q.add(ac2);
    q.add(hc);
    q.add(hc2);
    q.add(hc3);
    System.out.println(q.element());
    System.out.println(q.poll());
    System.out.println(q.element());
  }
}
