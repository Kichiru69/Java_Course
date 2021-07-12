package Lesson_20;

public class Test2 {
  static String[] abc(String[] ... arr) {
    int length = 0;
    int count = 0;
    for (String[] l: arr) {
      length+= l.length;
    }
    String[] array = new String[length];
    for (String[] a : arr) {
      for (String b : a) {
        array[count] = b;
        count++;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    for (String b : abc(new String[]{"B", "G"}, new String[]{"V", "TY", "privet"})) {
      System.out.println(b);
    }
  }
}
