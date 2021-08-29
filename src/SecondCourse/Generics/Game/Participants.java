package SecondCourse.Generics.Game;

abstract class Participants {
  private int age;
  private String name;

  @Override
  public String toString() {
    return "Participants{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  public Participants(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
