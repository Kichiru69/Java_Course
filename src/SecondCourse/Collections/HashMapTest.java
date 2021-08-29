package SecondCourse.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  public static void main(String[] args) {
    HashMap<AnimeCharacters, Integer> hm = new HashMap<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    HeroCharacters hc = new HeroCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters hc2 = new HeroCharacters("Kacchan", "Boku no hero Academia", 7);
    HeroCharacters hc3 = new HeroCharacters("Shoto", "Boku no hero Academia", 8);
    hm.put(ac, 1);
    hm.put(ac2, 11);
    hm.put(hc, 55);
    hm.put(hc2, 44);
    hm.put(hc3, 33);
//    System.out.println(hm);
//    System.out.println("kesySet "+hm.keySet());
//    System.out.println(hm.get(hc));
//    System.out.println("Values "+hm.values());
//    System.out.println("EntrySet "+hm.entrySet());

    int max = 0;
    for (Map.Entry<AnimeCharacters, Integer> i : hm.entrySet()) {
      if (i.getValue() > max) {
        max = i.getValue();
      }
    }
    for (AnimeCharacters i : hm.keySet()) {
      if (hm.get(i) == max) {
        System.out.println(i);
      }
    }

    HashMap<HeroCharacters, String> hchm = new HashMap<>();
    hchm.put(hc, "5");

  }
}
