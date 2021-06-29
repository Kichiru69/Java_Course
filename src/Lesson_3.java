public class Lesson_3 {

  public static void main(String[] args) {
    int i1 = 5, i2 = 11;
    double d1 = 5.5, d2 = 1.3;
    long l = 20L;
    double result = 0;
    result = i2 / d1 + d2 % i1 - l;
    double ex = 10 % 5;

    int a = 5, b = 8;
    int c = a-- - --a + ++a + a++ + a;
    int d = ++b - b++ + ++b - --b;
    System.out.println(c + " && " + d);
  }
}
