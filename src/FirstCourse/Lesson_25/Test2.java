package FirstCourse.Lesson_25;

public class Test2 {
  public static void main(String[] args) {
    byte a = 10;
    byte b = 5;
    byte c = (byte) (a + b);
  }
}

 class Characters {
  Characters(String name){
    this.name = name;
    System.out.println("New char "+ name);
  }
  String name;
  String sex;
  void run(){}
  void sleep() {
    System.out.println(name+" sleeps");
  }
}

class Tanjiro extends Characters implements Fight{
  Tanjiro(String name) {
    super(name);
    this.name = name;
  }
  @Override
  void run() {
    System.out.println(name + " is running");
  }

  @Override
  public void goodFighter() {
    System.out.println("Good at fight");
  }
}
interface Fight{
  void goodFighter();
  default void badFighter(){
    System.out.println("Bad fighter");
  }
}