package SecondCourse.Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
  public static void main(String[] args) {
    LinkedHashMap<AnimeCharacters, Integer> lhm = new LinkedHashMap<>(16, 0.75f, true);
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    lhm.put(ac, 1);
    lhm.put(ac2, 11);
    lhm.put(hc, 55);
    lhm.put(hc2, 44);
    lhm.put(hc3, 33);
    System.out.println(lhm);
    lhm.get(hc);
    System.out.println(lhm);
  }
}
