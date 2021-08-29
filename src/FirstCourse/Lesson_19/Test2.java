package FirstCourse.Lesson_19;

public class Test2 {
  static int[] arr = {8, 5, 4, 10, -1, 6, -11, 150};

  static void sorti(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < i; j++) {
          if (arr[i] < arr[j]) {
            int replace = arr[j];
            arr[j] = arr[i];
            arr[i] = replace;
          }
        }
      }
    }


  public static void main(String[] args) {
    sorti(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
