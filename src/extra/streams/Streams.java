package extra.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> drinks = new ArrayList<>();
        drinks.add("Gatorade");
        drinks.add("Water");
        drinks.add("Coffee");

        drinks = drinks.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        drinks = drinks.stream().filter(s -> s.startsWith("W")).collect(Collectors.toList());

        System.out.println(drinks);
    }

}
