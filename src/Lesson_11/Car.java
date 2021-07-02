package Lesson_11;

public class Car {
  String color;
  String engine;
  int doors;

  Car (String color, String engine, int doors) {
    this.color = color;
    this.engine = engine;
    this.doors = doors;
  }

  void changeDoors(int d) {
    doors = d;
  }
  static void car(Car c1, Car c2) {
    String c3 = c1.color;
    c1.color = c2.color;
    c2.color = c3;
  }

  public static void main(String[] args) {
    Car c1 = new Car("Blue", "V6", 4);
    Car c2 = new Car("Red", "N10", 2);
    car(c1, c2);
    c1.changeDoors(6);
    c2.changeDoors(8);
    System.out.println("Color - " + c1.color + ", Doors - " + c1.doors);
    System.out.println("Color - " + c2.color + ", Doors - " + c2.doors);
  }
}
