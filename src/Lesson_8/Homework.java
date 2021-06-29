package Lesson_8;

public class Homework {

  static final double Pi = 3.14;

  double area(double r) {
  return Pi * r * r;
  }

  static double length(double r) {
    return 2 * Pi * r;
  }

  void info(double r) {
    System.out.println("r "+r);
    System.out.println("area "+area(r));
    System.out.println("length "+ length(r));
  }

  static int multi(int a, int b, int c) {
    return a * b * c;
  }
  static void division(int a, int b) {
    System.out.println("division " + a / b);
  }
}

class SecondClass {
  public static void main(String[] args) {
    System.out.println("multi "+Homework.multi(1, 2, 3));
    Homework.division(25, 5);
    Homework h1 = new Homework();
    System.out.println("area "+h1.area(5));
    System.out.println("length " + Homework.length(5));
    h1.info(5);
  }
}
