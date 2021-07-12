package Lesson_19;

public class Test1 {
    static String [][] arr = {{"P", "r"}, {"iv", "et", "dr", "ug"}, {"!!"}};

    static void showArray(String[][] arr) {
      System.out.print("{ ");
      for (int i = 0; i < arr.length; i++) {
        System.out.print("{ ");
        for (int k = 0; k < arr[i].length; k++){
          if (k == arr[i].length - 1) {
            System.out.print(arr[i][k]);
            continue;
          }
          System.out.print(arr[i][k] + ", ");
        }
        if (i == arr.length - 1) {
          System.out.print(" } ");
          break;
        }
        System.out.print(" }, ");
      }
      System.out.print(" }");
    }


  public static void main(String[] args) {
    showArray(arr);
    }
  }

