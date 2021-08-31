package SecondCourse.Lambda;

import SecondCourse.Collections.AnimeCharacters;

import java.util.ArrayList;

public class LambdaTest {
  static int i = 0;

  static void print(ArrayList<AnimeCharacters> al, Filter2 f) {
    for (AnimeCharacters a : al) {
      if (f.test(a)) {
        System.out.println(a.getName());
      }
    }
  }
  static void printSome(ArrayList<AnimeCharacters> al, Filter3 f) {
    for (AnimeCharacters a : al) {
      if (f.test(a, i) >= 8) {
        System.out.println(a.getName() + " is powerful");
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
    al.sort((a,b) -> a.getPower() - b.getPower());
    i = 5;
    print(al, c -> c.getFandom().equals("Kimitsu no Yaiba"));
    printSome(al, (v,i) -> {
      i = 1;
      return v.getPower() * i;
    });

  }
}

interface Filter2 {
  boolean test(AnimeCharacters ac);
}
interface Filter3 {
  int test(AnimeCharacters ac, int a);
}