package SecondCourse.Collections;

import java.util.*;

public class Iterators {
  public static void main(String[] args) {
    ArrayList<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(5);
    integerList.add(156);
    Iterator<Integer> integerIterator = integerList.iterator();
    while (integerIterator.hasNext()) {
      System.out.println(integerIterator.next());
    }

    String s = "madam";
    boolean b = true;
    List<Character> stringList = new LinkedList<>();
    for (char c: s.toCharArray()) {
      stringList.add(c);
    }
    ListIterator<Character> iterator = stringList.listIterator();
    ListIterator<Character> reverseIterator = stringList.listIterator(stringList.size());
    while (iterator.hasNext() && reverseIterator.hasPrevious()) {
      if (!iterator.next().equals(reverseIterator.previous())) {
        b = false;
        break;
      }
    }
    System.out.println("Is polynothing - " + b);
  }
}

