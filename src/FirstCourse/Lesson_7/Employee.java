package FirstCourse.Lesson_7;

public class Employee {
  int id;
  public String surname;
  int age;
  private int salary;
  String department;

  Employee(int id, String surname, int age, int salary, String department) {
  this.id = id;
  this.surname = surname;
  this.age = age;
  this.salary = salary;
  this.department = department;
  }
  public Employee (int id, String surname, int salary) {
    this(id, surname, 25, salary, "default");
  }

  private Employee(int salary) {
    this(66, "Ivanov", 55, salary, "Mya");
  }

  public void showId() {
    System.out.println(id);
  }
  public void showSurname() {
    System.out.println(surname);
  }
  public void showSalary() {
    System.out.println(salary);
  }

  int doubleSalary() {
    return salary * 2;
  }
}
class EmployeeTest {
  public static void main(String[] args) {
    Employee first = new Employee(1, "Ivan", 40, 66000, "HZ");
    Employee second = new Employee(2, "Kuro", 10000);
    //Employee third = new Employee(150000);
    System.out.println(first.doubleSalary());
    System.out.println(second.doubleSalary());
  }
}
