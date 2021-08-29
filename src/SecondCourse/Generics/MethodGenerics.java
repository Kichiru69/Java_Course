package SecondCourse.Generics;

import java.util.ArrayList;
import java.util.List;

public class MethodGenerics {
  static <T> T method(ArrayList<T> aL) {
    return aL.get(1);
  }

  void wildCard(List<?> wc) {
    System.out.println(wc);
  }

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(15);
    integers.add(666);
    System.out.println(method(integers));
    ArrayList<String> strings = new ArrayList<>();
    strings.add("OK");
    strings.add("HI!");
    System.out.println(method(strings));
  }
}

class ExtendsGenerics<T extends Number> {

  T method(T a) {
    return a;
  }
}

class test {
 static int i = 0;
  public static void main(String[] args) {

    i++;
    System.out.println(i);
    new test().plus(i);
    System.out.println(i);
  }

  int plus(int i) {
    System.out.println(i);
    return ++test.i;
  }
}
