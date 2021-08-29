package SecondCourse.NestedClass;

public class StaticNestedClass {
  int rate;
  String name;
  Genre genre;

  public StaticNestedClass(int rate, String name, Genre genre) {
    this.rate = rate;
    this.name = name;
    this.genre = genre;
  }
  static class Genre {
    String genre;

    public Genre(String genre) {
      this.genre = genre;
    }
  }
}

class testStaticNestedClass {
  public static void main(String[] args) {
    StaticNestedClass.Genre genre = new StaticNestedClass.Genre("Pop");
    StaticNestedClass snc = new StaticNestedClass(8, "Starish", genre);
  }
}
