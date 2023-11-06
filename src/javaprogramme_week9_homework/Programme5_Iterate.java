package javaprogramme_week9_homework;
/**
 Write a Java program to iterate through all elements in an array list using
 Iterater
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5_Iterate {
    public void Iterator(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        //using iterator
        Iterator itr= list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Programme5_Iterate obj = new Programme5_Iterate();
        obj.Iterator();

    }
}
