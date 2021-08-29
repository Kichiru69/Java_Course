package FirstCourse.Lesson_22;

public class Test {
  public static void main(String[] args) {
    Dog dog = new Dog("Bobik");
    System.out.println(dog.paw);
    Cat cat = new Cat("Alice");
    cat.sleep();
    cat.eat();
    System.out.println(dog.name);
  }
}
