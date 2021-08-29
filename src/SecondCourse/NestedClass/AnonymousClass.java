package SecondCourse.NestedClass;

public class AnonymousClass {
  public static void main(String[] args) {
    Math m = new Math() {
      @Override
      public int doOperation(int a, int b) {
        return a + b;
      }
    };
    System.out.println(m.doOperation(5, 10));

    Math2 m2 = new Math2() {
      @Override
      int math2(int a) {
        return a+a;
      }
    };
    System.out.println(m2.math2(5));

    Math2 m22 = new Math2();
    System.out.println(m22.math2(5));
    }
  }


interface Math {
  int doOperation(int a, int b);
}

class Math2 {
  int math2(int a) {
    return a*a;
  }
}
