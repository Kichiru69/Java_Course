package FirstCourse.Lesson_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Employee implements Comparable<Employee> {
  String name;
  String department;
  int salary;


  public Employee(String name, String department, int salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }


  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            '}';
  }

  @Override
  public int compareTo(Employee o) {
    return this.salary - o.salary;
  }
}

class TestEmployee {
  static void printEmployee(Employee e) {
    System.out.println("Name "+ e.name + ", Department "+ e.department + ", Salary "+ e.salary);
  }
  static void filterEmployee(ArrayList<Employee> aL, Predicate<Employee> p) {
    for (Employee e: aL) {
      if (p.test(e)) {
        printEmployee(e);
      }
    }
  }

  public static void main(String[] args) {
    Employee e1 = new Employee("Vika", "IT", 250);
    Employee e2 = new Employee("Masha", "Masha", 1000);
    Employee e3 = new Employee("Vlad", "PD", 101);
    Employee e4 = new Employee("Elena", "SOLO", 550);
    Employee e5 = new Employee("QWER", "IT", 900);
    Employee e6 = new Employee("YHN", "YHN", 1000);
    Employee e7 = new Employee("YA", "RFVtgb", 1);
    Employee e8 = new Employee("Evnuh", "SOLO_2", 55_0);
    ArrayList<Employee> aL = new ArrayList<>();
    aL.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
    filterEmployee(aL, (Employee e) -> e.department.equals("IT") && e.salary > 200);
    System.out.println("______________________________");
    filterEmployee(aL, e -> e.name.startsWith("E") && e.salary != 450);
    System.out.println("______________________________");
    filterEmployee(aL, x -> x.name.equals(x.department));
  }
}
