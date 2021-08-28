package chapter_3.searching_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        int [] numbers = {10, 4, 2, 6, 8};
        int i2 = Arrays.binarySearch(numbers, 6);
        System.out.println(i2);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int i = Arrays.binarySearch(numbers, 6);
        System.out.println(i);

        int i1 = Arrays.binarySearch(numbers, 1);
        System.out.println(i1);
    }
}
