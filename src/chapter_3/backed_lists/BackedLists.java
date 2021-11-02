package chapter_3.backed_lists;

import java.util.Arrays;
import java.util.List;

public class BackedLists {

    public static void main(String[] args) {
        //page 137

        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list 22: System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1); // throws UnsupportedOperation Exception

        List<Integer> nums = Arrays.asList(1, 3,  4,  5);
        Integer[] objects = nums.toArray(new Integer[0]);

    }

}
