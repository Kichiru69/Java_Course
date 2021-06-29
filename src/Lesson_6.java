public class Lesson_6 {

  int sum() {
    return 0;
  }
  int sum(int a) {
    return a;
  }
  int sum (int a, int b) {
    int i = a + b;
    System.out.println(i);
    return i;
  }
  int sum (int a, int b, int c) {
    int i = a + b + c;
    System.out.println(i);
    return i;
  }
  int sum (int a, int b, int c, int d) {
    int i = a + b + c + d;
    System.out.println(i);
    return i;
    
  }
}
  class Test {
  public static void main(String[] args) {
    Lesson_6 l = new Lesson_6();
    l.sum(5,6,7,8);
    l.sum(146,899);
  }
  }
