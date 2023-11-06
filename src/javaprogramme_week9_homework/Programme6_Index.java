package javaprogramme_week9_homework;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Programme6_Index {
    public static void main(String[] args) {
    index();
    }
    public static void index(){

        ArrayList<Object>list = new ArrayList();
        list.add("Disha");
        list.add("Shilpa");
        list.add("Manish");
        list.add("Viral");
        list.add("Vaibhavi");
        //getting value "Viral" in console
        System.out.println(list.get(4));
    }
}
