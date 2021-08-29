package FirstCourse.Lesson_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test2 {
  public static void main(String[] args) {
    ArrayList<String> st = new ArrayList<>();
    st.add("QWE");
    st.add("ASD");

    ArrayList<String> st2 = new ArrayList<>();
    st2.add("ZXC");
    st2.add("RFV");
    st2.add(st.get(1));
    Collections.sort(st2);


    Iterator <String> i = st2.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
