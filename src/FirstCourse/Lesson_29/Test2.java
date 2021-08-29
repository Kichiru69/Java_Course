package FirstCourse.Lesson_29;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {
  public static void main(String[] args) throws ParseException {
    String setupDate = "06.08.2021 00:00";
    setupDate = setupDate.replaceAll("\\s.*", "");

    DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate date = LocalDate.parse("06.08.2021 00:00", inputFormat);
    LocalDate d = LocalDate.now();
    if (date.isAfter(d)) {
      String st = d.minusDays(1).format(inputFormat);
      System.out.println(st);
    }
  }
}
