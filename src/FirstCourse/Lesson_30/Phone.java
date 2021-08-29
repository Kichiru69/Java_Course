package FirstCourse.Lesson_30;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Phone {
  String name;
  int modelNumber;
  String os;
  Phone(String name, int modelNumber, String os) {
    this.name = name;
    this.modelNumber = modelNumber;
    this.os = os;
  }

  static ArrayList<Phone> createPhone(Supplier<Phone> supplier) {
    ArrayList<Phone> al = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      al.add(supplier.get());
    }
    return al;
  }
 public String toString() {
   return name + " " + modelNumber + " " + os;
 }
 static void changePhone(Phone ph, Consumer<Phone> consumer) {
    consumer.accept(ph);
 }
 static void isSimilar(Phone ph, Predicate<Phone> predicate) {
    if (predicate.test(ph)) {
      System.out.println("Similar Phones");
    } else {
      System.out.println("Not similar");
    }
 }

  public static void main(String[] args) {
    ArrayList<Phone> al = createPhone(() -> new Phone("Xiaomi", 9, "Android"));
    System.out.println(al);
    changePhone(al.get(1), phone -> {phone.name="Iphone"; phone.modelNumber=5; phone.os="IOS";});
    System.out.println(al);
    isSimilar(al.get(0), phone -> phone.name.equals(al.get(2).name));
  }
}
