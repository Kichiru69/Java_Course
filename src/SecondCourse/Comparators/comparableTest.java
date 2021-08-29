package SecondCourse.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableTest implements Comparable<comparableTest> {
  comparableTest(int id, String name, String surname) {
    this.id = id;
    this.name = name;
    this.surname=surname;
  }
  int id;
  String name;
  String surname;

  public static void main(String[] args) {
    comparableTest t1 = new comparableTest(1, "Valya", "Agafonova");
    comparableTest t2 = new comparableTest(15, "Anna", "Ivanova");
    comparableTest t3 = new comparableTest(5, "Anna", "Deschain");
    List<comparableTest> aL = new ArrayList<>();
    aL.add(t1);
    aL.add(t2);
    aL.add(t3);
    System.out.println(aL);
    Collections.sort(aL);
    System.out.println(aL);
  }

  @Override
  public int compareTo(comparableTest o) {
    return this.id - o.id;
  }

  @Override
  public String toString() {
    return "comparableTest{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            '}';
  }
}
