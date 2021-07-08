package Lesson_15;

public class Test1 {

  static void time(){
    int h = 0;

    while (h < 6) {
      int m = 0;
      while (m < 60) {
        int s = 0;
        while (s < 60) {
          System.out.println(h + ":" + m + ":" + s);
          s++;
        }
        m++;
      }
      h++;
    }
  }

  public static void main(String[] args) {
    time();
  }
}
