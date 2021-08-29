package FirstCourse.Lesson_28;

import java.io.*;

public class Test {
  public static void main(String[] args) {
    File f = new File("Test1.txt");

    {
      try {
        FileInputStream fit = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(1456789);
        System.out.println(fit.read());
        fos.close();
      } catch (FileNotFoundException e) {
        System.out.println("Ex: "+ e.getMessage());
      } catch (IOException e) {
        e.printStackTrace();
      }


    }
  }

}
