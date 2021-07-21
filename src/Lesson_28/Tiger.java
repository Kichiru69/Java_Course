package Lesson_28;


public class Tiger {
  public void eat(String st) {
    if (!st.equals("myaso")) {
      throw new NeMyasoException("Tiger ne est " + st);
    } else {
      System.out.println("Tiger est myaso");
    }
  }
  public void drink(String st) throws NeVodaException {
    if (!st.equals("voda")) {
      throw new NeVodaException("Tiger ne piet " + st);
    } else {
      System.out.println("Tiger piet vody");
    }
  }
}
