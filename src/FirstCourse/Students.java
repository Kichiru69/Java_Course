package FirstCourse;

class Students {
  int id;
  String firstname;
  String lastname;
  int math;
  int economic;
  int english;
  String course;

  Students(int id, String firstname, String lastname, int math, int economic, int english, String course) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.math = math;
    this.economic = economic;
    this.english = english;
    this.course = course;
  }
  Students(int id, String firstname, String lastname) {
    this(id, firstname, lastname, 0, 0, 0, "Unknown course");
  }

  Students() {}


  int srednyaOtsenka(Students st) {
    int result = (st.math + st.economic + st.english) / 3;
    System.out.println(result);
    return result;
  }
}
    class studentTest {
    public static void main(String[] args) {
      Students first = new Students(1, "Ichigo" , "Kurosaki" , 5, 4, 3 , "Some");
      Students second = new Students(2, "Shinji", "Ikari");
      Students thirth = new Students();

      second.math = 2;
      thirth.math = 4;

      second.economic = 2;
      thirth.economic = 3;

      second.english = 2;
      thirth.english = 4;

      thirth.srednyaOtsenka(thirth);

      System.out.println(first.firstname + " " + first.lastname);
      first.srednyaOtsenka(first);

      System.out.println(second.firstname + " " + second.lastname);
      second.srednyaOtsenka(second);
    }
  }

