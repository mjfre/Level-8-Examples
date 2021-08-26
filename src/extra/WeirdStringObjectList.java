package extra;

import java.util.ArrayList;
import java.util.List;

public class WeirdStringObjectList {

    public static void main(String[] args) {
        List something = new ArrayList();

        something.add("goldfish");

        System.out.println(something.get(0) == "goldfish");

    }
}
