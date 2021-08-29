package SecondCourse.Collections;

import java.util.LinkedList;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Test");
    String s1 = "Test";
    if (ll.contains(s1)) {
      System.out.println(ll.get(0));
    }
  }
}
