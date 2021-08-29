package SecondCourse.Collections;

import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    HashSet<AnimeCharacters> hs = new HashSet<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    hs.add(ac);
    hs.add(ac2);
    hs.add(hc);
    hs.add(hc2);
    hs.add(hc3);
    System.out.println(hs);
  }
}
