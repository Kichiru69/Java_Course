package FirstCourse.Lesson_27;

import FirstCourse.Lesson_28.*;

public class Test1 {
  public static void main(String[] args) {
    Tiger t = new Tiger();
    t.eat("myaso");
    try {
      t.drink("voda");
      try {
        t.drink("pivo");
      } catch (NeVodaException e2) {
        System.out.println(e2.getMessage());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } finally {
        System.out.println("Final block");
      }
    } catch (RuntimeException r) {
      System.out.println(r.getMessage());
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

  }
}
