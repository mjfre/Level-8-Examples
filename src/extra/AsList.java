package extra;

import java.util.Arrays;
import java.util.List;

public class AsList {

    public static void main(String[] args) {

        String[] strArr = {"one", "two", "three"};

        List<String> strings = Arrays.asList(strArr);

        //strings.remove(0);

        strings.set(0, "zero");

        System.out.println(Arrays.toString(strArr));
    }
}
