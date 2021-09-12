package chapter_3.reference_equals_vs_equals;

import java.util.ArrayList;

public class ReferenceEqualityVsEquals {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o1));

        String s1 = "Wrigley";
        String s2 = new String("Wrigley");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String[] array1 = new String[1];
        array1[0] = "Brooklyn";
        String[] array2 = new String[1];
        array2[0] = "Brooklyn";
        System.out.println(array1.equals(array2));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Brooklyn");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Brooklyn");

        System.out.println(list1.equals(list2));

    }

}
