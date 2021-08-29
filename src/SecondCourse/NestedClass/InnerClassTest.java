package SecondCourse.NestedClass;

public class InnerClassTest {
  int rate;
  String name;
  Genre genre;

  public InnerClassTest(int rate, String name, String genre) {
    this.rate = rate;
    this.name = name;
    this.genre = this.new Genre(genre);
  }
  class Genre {
    String genre;

    public Genre(String genre) {
      this.genre = genre;
    }
  }
}

class testInnerNestedClass {
  public static void main(String[] args) {
    InnerClassTest ict = new InnerClassTest(7, "Subaru", "Rap");
    InnerClassTest.Genre genre = ict.new Genre("Pop");
    InnerClassTest ict2 = new InnerClassTest(8, "Alice", "genre");
  }
}

