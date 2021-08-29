package FirstCourse.p4;

import FirstCourse.p1.*;
import FirstCourse.p1.p2.B;
import FirstCourse.p1.p2.p3.C;
import FirstCourse.p4.p5.E;

public class D {
  public static void main(String[] args) {
    System.out.println(A.a);
    System.out.println(A.a());
    A a = new A();
    System.out.println(a.b());
    System.out.println(a.b);
    System.out.println();
    System.out.println(B.i);
    System.out.println(B.s);
    System.out.println(B.abc(50));
    System.out.println();
    System.out.println(C.aa);
    System.out.println(C.aa);
    C c = new C();
    System.out.println(c.bb);
    System.out.println(c.bb());
    System.out.println();
    System.out.println(E.aaa);
  }

}
