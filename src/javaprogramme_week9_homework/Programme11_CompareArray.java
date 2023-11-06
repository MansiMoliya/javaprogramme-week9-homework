package javaprogramme_week9_homework;
/**
 * Declare following two arrylist and compare it.
 */

import java.util.ArrayList;

public class Programme11_CompareArray {
    public static void main(String[] args) {
        compareArr();
    }
    public static void compareArr(){
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
//        System.out.println("c1: " +c1);
//        System.out.println("c2:"+c2);
      boolean val=c1.equals(c2);
        System.out.println(val);
    }
}
