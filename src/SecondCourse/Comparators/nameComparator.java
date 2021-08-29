package SecondCourse.Comparators;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nameComparator implements Comparator<comparableTest> {

  @Override
  public int compare(comparableTest o1, comparableTest o2) {
    return o1.name.compareTo(o2.name);
  }

  public static void main(String[] args) {
    comparableTest t1 = new comparableTest(1, "Valya", "Agafonova");
    comparableTest t2 = new comparableTest(15, "Anna", "Ivanova");
    comparableTest t3 = new comparableTest(5, "Anna", "Deschain");
    List<comparableTest> aL = new ArrayList<>();
    aL.add(t1);
    aL.add(t2);
    aL.add(t3);
    System.out.println(aL);
    Collections.sort(aL, new nameSurnameComparator());
    System.out.println(aL);
  }
}

class nameSurnameComparator implements Comparator<comparableTest> {

  @Override
  public int compare(comparableTest o1, comparableTest o2) {
    int res = o1.name.compareTo(o2.name);
    if (res==0) {
      res = o1.surname.compareTo(o2.surname);
    }
    return res;
  }
}
