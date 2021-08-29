package SecondCourse.Collections;

import java.util.TreeMap;

public class TreeMapTest {
  public static void main(String[] args) {
    TreeMap<AnimeCharacters, Integer> tm = new TreeMap<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    tm.put(ac, 1);
    tm.put(ac2, 11);
    tm.put(hc, 55);
    tm.put(hc2, 44);
    tm.put(hc3, 33);
    System.out.println(tm.descendingMap());
  }
}
