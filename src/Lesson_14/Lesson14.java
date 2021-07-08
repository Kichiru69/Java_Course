package Lesson_14;

public class Lesson14 {

  static void time() {
    FIRST: for(int i = 0; i <= 6; i++) {
      SECOND: for (int x = 0; x <= 59; x++) {
        if (i>1 && x%10==0){
          break FIRST;
        }
        for (int y = 0; y <= 59; y++) {
          if (y*i>x) {
            continue SECOND;
          }
          System.out.println(i + ":" + x + ":" + y);
        }
      }
    }
  }

  public static void main(String[] args) {
    time();
  }
}
