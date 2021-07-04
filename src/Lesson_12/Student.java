package Lesson_12;

import java.util.Objects;

public class Student {
  String name;
  int course;
  double grade;

  Student(String name, int course, double grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  static void equals(Student s1, Student s2) {
    if (s1.name.equals(s2.name) && s1.grade== s2.grade && s1.course== s2.course) {
      System.out.println("Objects are equals");
    } else
      System.out.println("Not equals");
  }
  static void nestedEquals(Student s1, Student s2) {
    if (s1.name.equals(s2.name)){
      if (s1.course== s2.course){
        if (s1.grade== s2.grade){
          System.out.println("Все параметры равны");
        } else {
          System.out.println("Оценки не равны");
        }
      } else {
        System.out.println("Курс не равен");
      }
    } else {
      System.out.println("Имена не равны");
    }
  }

}

class StudentTest{
  public static void main(String[] args) {
  Student s1 = new Student("Olya", 5, 7.7);
  Student s2 = new Student("Oly", 5, 7.7);
  Student.equals(s1,s2);
  Student.nestedEquals(s1, s2);
  }
}
