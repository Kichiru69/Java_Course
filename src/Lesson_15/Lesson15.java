package Lesson_15;

public class Lesson15 {
  static void time() {
    int h = 0;

    OUTER:
    while (h < 6) {
      int m = -1;
      MIDDLE:
      do {
        m++;
        int s = 0;
        if (h > 1 && m % 10 == 0) {
          break OUTER;
        }
        while (s < 60) {
          if (s*h>m) {
            continue MIDDLE;
          }
          System.out.println(h + ":" + m + ":" + s);
          s++;
        }

      } while (m < 59);
      h++;
    }
  }

  public static void main(String[] args) {
    time();
  }
}


