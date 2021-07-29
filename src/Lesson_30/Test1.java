package Lesson_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {

  static ArrayList<Integer> addNumber(Supplier<Integer> supplier) {
    ArrayList<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 7; i++) {
      integers.add(supplier.get());
    }
    return integers;
  }
  static void changeNumber(Integer i, Consumer<Integer> consumer) {
    consumer.accept(i);
  }

  static int summAll(List<Integer> al, Predicate<Integer> p) {
    int i = 0;
    for (Integer in:al) {
      if (p.test(in)) {
        i+=in;
      }
    } return i;
  }

  public static void main(String[] args) {
    ArrayList<Integer> al = addNumber(() -> 5);
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int b = summAll(numbers, integer -> integer % 2 != 0);
    System.out.println(b);
    int c = summAll(numbers, i -> i != 5 && i != 6);
    System.out.println(c);
    int[] h = new int[] {5,10,1};

  }
}
