package chapter_4.lambda_expressions.remove_if;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

//        String[] myAnimals = {"Lion", "Tiger", "Bear"};
//        List<String> animals = Arrays.asList(myAnimals);
//        myAnimals[0] = "hello";

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");

        animals.removeIf(s -> s.toLowerCase().startsWith("li"));

        System.out.println(animals);

    }

}
