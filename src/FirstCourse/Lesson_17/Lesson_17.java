package FirstCourse.Lesson_17;

public class Lesson_17 {
  static String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com";

  static void domen(String s1) {
    for (int i = 0; i < s1.length(); i++) {
      char q = s1.charAt(i);
      if (q == '@') {
        int f = s1.indexOf('@', i);
        int s = s1.indexOf('.', i);
        System.out.println(s1.substring(f+1, s));
      }
    }
  }

  public static void main(String[] args) {
    domen(s1);
  }
}
