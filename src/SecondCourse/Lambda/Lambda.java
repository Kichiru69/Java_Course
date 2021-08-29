package SecondCourse.Lambda;

import SecondCourse.Collections.AnimeCharacters;
import java.util.ArrayList;

public class Lambda {
  static void characterCheck(ArrayList<AnimeCharacters> al, Filter f) {
    for (AnimeCharacters a: al) {
      if (f.check(a)) {
        System.out.println(a);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<AnimeCharacters> al = new ArrayList<>();
    AnimeCharacters ac = new AnimeCharacters("Tanjiro", "Kimitsu no Yaiba", 10);
    AnimeCharacters ac2 = new AnimeCharacters("Nezuko", "Kimitsu no Yaiba", 6);
    AnimeCharacters ac3 = new AnimeCharacters("Midoriya", "Boku no hero Academia", 8);
    AnimeCharacters ac4 = new AnimeCharacters("Kacchan", "Boku no hero Academia", 7);
    AnimeCharacters ac5 = new AnimeCharacters("Shoto", "Boku no hero Academia", 8);
    al.add(ac2);
    al.add(ac);
    al.add(ac3);
    al.add(ac4);
    al.add(ac5);
    characterCheck(al, (AnimeCharacters a) -> a.getPower() < 8);
    System.out.println("_____________________________");
    characterCheck(al, (AnimeCharacters a) -> a.getFandom().equals("Boku no hero Academia") && a.getName().equals("Shoto"));
    System.out.println("_____________________________");

    characterCheck(al, new Filter() {
      @Override
      public boolean check(AnimeCharacters ac) {
        return ac.getPower() < 8;
      }
    });
  }
}

interface Filter {
  boolean check(AnimeCharacters ac);
}
