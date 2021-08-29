package FirstCourse.Lesson_21;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
  static void abc(String ... st) {
    ArrayList<String> aL = new ArrayList<>();
     for (String s:st) {
     if (!aL.contains(s)) {
       aL.add(s);
     }
    }
    Collections.sort(aL);
    System.out.println(aL);
  }

  public static void main(String[] args) {
    String s = "Privet";
    abc("1", "Privet", "Privet", "poka", "Cho kak", "?", "?", s, "Aaaa", "B", "90");
  }
}
