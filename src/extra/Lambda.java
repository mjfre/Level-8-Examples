package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {


    public static List<String> capitalize(Predicate<String> filterBy, List<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            if(filterBy.test(strings.get(i))){
                strings.set(i, strings.get(i).toUpperCase());
            }
        }
        return strings;
    }




    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cow");
        animals.add("ostrich");
        animals.add("ocelot");
        animals.add("sea monkey");

        List<String> o = capitalize(pencil -> pencil.startsWith("o"), animals);
        System.out.println(o);

        animals = new ArrayList<>();
        animals.add("cow");
        animals.add("ostrich");
        animals.add("ocelot");
        animals.add("sea monkey");

        List<String> o2 = capitalize(pencil -> pencil.length()<4, animals);
        System.out.println(o2);

    }

}
