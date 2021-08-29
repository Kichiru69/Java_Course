package FirstCourse.Lesson_29;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.*;

public class Test1 {
  static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMMM-d !! hh:mm");
  static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, d/MMM/yy");

  static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
    while (ldt1.isBefore(ldt2)) {
      System.out.println("Work from: "+ ldt1.format(dtf));
      ldt1=ldt1.plus(p);
      System.out.println("Relax from: "+ ldt1.format(dtf2));
      ldt1=ldt1.plus(d);
      System.out.println("Until: "+ ldt1.format(dtf));
      System.out.println();
    }
  }

  public static void main(String[] args) {
    LocalDateTime ldt1 = LocalDateTime.of(2015, 1, 1, 9, 0);
    LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
    Period p = Period.ofMonths(2);
    Duration d = Duration.ofDays(15);
    smena(ldt1,ldt2,p,d);
  }
}
