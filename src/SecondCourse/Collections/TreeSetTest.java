package SecondCourse.Collections;

import java.util.TreeSet;

public class TreeSetTest {
  public static void main(String[] args) {
    TreeSet<AnimeCharacters> ts = new TreeSet<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    ts.add(ac);
    ts.add(ac2);
    ts.add(hc);
    ts.add(hc2);
    ts.add(hc3);
    System.out.println(ts);
  }
}
