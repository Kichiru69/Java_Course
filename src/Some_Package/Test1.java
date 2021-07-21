package Some_Package;

public class Test1 {
  static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i ; j++) {
        if (arr[j] > arr[i]) {
          int min = arr[j];
          arr[j] = arr[i];
          arr[i] = min;
        }
      }
    }
    for (int a:arr) {
      System.out.print(a + " ");
    }
  }
  public static void main(String[] args) {
    sort(new int[] {16,42,15,4,23,8});
    BubbleSorter.sort(new int[] {16,42,15,4,23,8});
  }
}
 class BubbleSorter {
  public static void sort (int[] arr)  {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i ; j++) {
        if (arr[j] > arr[i]) {
          int min = arr[j];
          arr[j] = arr[i];
          arr[i] = min;
        }
      }
    }
  }
}
