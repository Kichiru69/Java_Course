package Lesson_18;

public class Test1 {
  static boolean ravenctvo(StringBuilder sb1, StringBuilder sb2) {
    String s1 = new String(sb1);
    String s2 = new String(sb2);
    return s1.equals(s2);
  }

  static boolean rav(StringBuilder sb1, StringBuilder sb2) {
    boolean b = true;
    if (sb1.length() != sb2.length()) {
      b = false;
    } else {
      for (int i = 0; i < sb1.length(); i++) {
        char a = sb1.charAt(i);
        char a2 = sb2.charAt(i);
        if (a!=a2) {
          b = false; break;
        }
      }
    }
    return b;
  }

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Priv");
    StringBuilder sb2 = new StringBuilder("Priv");
    System.out.println(rav(sb1, sb2));
  }
}

