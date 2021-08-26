package chapter_3.autoboxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Autoboxing {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(null);
        for(int i : numbers){
            System.out.println(i);
        }

        Map<Short, Integer> usCitizenAgeCount = new HashMap<>();
        usCitizenAgeCount.put((short)5, 5_143_345);
        System.out.println(usCitizenAgeCount.get(5));
    }
}
