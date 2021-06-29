package Some_Package;

import Lesson_7.Employee;

public class Lesson_7_1 {
  public static void main(String[] args) {
    Employee emp = new Employee(1, "Deku", 55000);
    Employee emp2 = new Employee(2, "Shoto", 150_000);
    System.out.println(emp.surname);
    emp.showSalary();
    emp2.showId();
  }
}
