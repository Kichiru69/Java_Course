package SecondCourse.Collections;

import FirstCourse.Lesson_30.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
  public static void main(String[] args) {
    Employee e1 = new Employee("Name1", "D1" , 10000);
    Employee e2 = new Employee("Name2", "D2" , 5000);
    Employee e3 = new Employee("Name3", "D3" , 15000);
    Employee e4 = new Employee("Name3", "D3" , 4500);
    List<Employee> employeeArrayList = new ArrayList<>();
    employeeArrayList.add(e1);
    employeeArrayList.add(e2);
    employeeArrayList.add(e3);
    employeeArrayList.add(e4);
    System.out.println(employeeArrayList);
    Collections.sort(employeeArrayList);
    System.out.println(employeeArrayList);
    System.out.println(Collections.binarySearch(employeeArrayList, new Employee("Name5", "D7" , 10000)));
  }

}
