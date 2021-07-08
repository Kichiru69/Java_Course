package Lesson_13;

public class Month {

  static void month(int i) {
    switch (i) {
      case 1:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      case 3:
        System.out.println("31 день");
        break;
      case 2:
        System.out.println("28 дней");
        break;
      case 6:
      case 9:
      case 11:
      case 4:
        System.out.println("30 дней");
        break;
      default:
        System.out.println("Нет такого месяца");
    }
  }
}
class MonthTest {
  public static void main(String[] args) {
    Month.month(5);
  }
}
