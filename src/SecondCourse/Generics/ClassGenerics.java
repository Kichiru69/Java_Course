package SecondCourse.Generics;

public class ClassGenerics<T> {
  private T value;

  ClassGenerics(T value) {
    this.value=value;
  }

  void showInfo() {
    System.out.println(value);
  }

  public T getValue() {
    return value;
  }

  public static void main(String[] args) {
    ClassGenerics<String> c1 = new ClassGenerics<>("OK");
    c1.showInfo();
    ClassGenerics<Integer> c2 = new ClassGenerics<>(1564);
    System.out.println(c2.getValue());
  }
}
