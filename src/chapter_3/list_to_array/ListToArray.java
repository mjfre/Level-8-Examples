package chapter_3.list_to_array;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);

        Object[] objects = numbers.toArray();
       // int[] numberArray = numbers.toArray(new int[0]);
    }
}
