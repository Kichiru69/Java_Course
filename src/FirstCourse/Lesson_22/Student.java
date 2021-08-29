package FirstCourse.Lesson_22;

public class Student {

  private StringBuilder name = new StringBuilder();
  private int course;
  private int grade;

  public StringBuilder getName() {
    return new StringBuilder(name);
  }

  public void setName(StringBuilder name) {
    if (name.length() >= 3) {
      this.name = name;
    }
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    if (course >= 1 && course <= 4) {
      this.course = course;
    }
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    if (grade >= 1 && grade <= 10) {
      this.grade = grade;
    }
  }

  void showInfo() {
    System.out.println(getName());
    System.out.println(getCourse());
    System.out.println(getGrade());
    System.out.println();
  }
}

class TestStudent {
  public static void main(String[] args) {
    Student st1 = new Student();
    st1.setName(new StringBuilder("Yan"));
    st1.setCourse(4);
    st1.setGrade(10);
    st1.showInfo();
    Student st2 = new Student();
    st2.setName(new StringBuilder("Olya"));
    st2.setCourse(1);
    st2.setGrade(5);
    st2.getName().append("!!!");
    st2.showInfo();
  }
}
