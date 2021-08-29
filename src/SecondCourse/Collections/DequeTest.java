package SecondCourse.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
  public static void main(String[] args) {
    Deque<AnimeCharacters> dq = new ArrayDeque<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    dq.add(ac);
    dq.add(ac2);
    dq.add(hc);
    dq.add(hc2);
    dq.add(hc3);
    System.out.println(dq.getFirst());
    System.out.println(dq.getLast());
  }
}
