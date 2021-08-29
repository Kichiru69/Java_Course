package FirstCourse.Lesson_20;

public class Test1 {

  static String[] abc(String [] ... arr) {
    int length = 0;
    int count = 0;
    for (String [] array : arr) {
      length+= arr.length;
    }
    String[] arrayNew = new String[length];
    for (String[] b : arr) {
      for (String a : b) {
      arrayNew[count] = a;
      count++;
      }
    }
    return arrayNew;
  }

  public static void main(String[] args) {
    String [] arr = {"P", "R"};
    String [] arr2 = {"I", "V"};
    abc(arr, arr2);
  }
}
