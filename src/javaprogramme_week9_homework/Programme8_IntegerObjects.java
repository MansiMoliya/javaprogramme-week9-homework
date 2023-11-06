package javaprogramme_week9_homework;
/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;
import java.util.Set;

public class Programme8_IntegerObjects {
    public static void main(String[] args) {
        Integer();
    }

    public static void Integer() {
        //using for loop and if else if degit is between 1 to 10
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i))
                System.out.println(i + " number has been found  ");
            else System.out.println(i + " " + "number is not in list ");
        }
    }
}

