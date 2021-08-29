package SecondCourse.Collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {
  public static void main(String[] args) {
    PriorityQueue<AnimeCharacters> pq = new PriorityQueue<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    pq.add(ac);
    pq.add(ac2);
    pq.add(hc);
    pq.add(hc2);
    pq.add(hc3);
    System.out.println(pq.element());
  }
}
