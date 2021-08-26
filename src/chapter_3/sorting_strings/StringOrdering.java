package chapter_3.sorting_strings;

import java.util.Arrays;

public class StringOrdering {

    public static void main(String[] args) {
        String[] strings = {"ab" ,  "aa",  "1a", "*a"};

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));
    }
}
