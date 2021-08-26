package chapter_3.chapter_review;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
//        Collections.sort(hex);
        System.out.println(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "2");
        int a = Collections.binarySearch(hex, "22");
        System.out.println(x + " " + y + " " + z + " " + a);
    }
}
