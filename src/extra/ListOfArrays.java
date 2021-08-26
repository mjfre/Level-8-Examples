package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfArrays {
    public static void main(String[] args) {
        String domesticatedAnimals [] = {"cat", "dog"};

        List<String[]> zoo = new ArrayList<>();

        zoo.add(domesticatedAnimals);

//        System.out.println(zoo);

//        System.out.println(Arrays.toString(zoo.get(0)));



        List<String> domesticatedAnimalsList = Arrays.asList(domesticatedAnimals);


        System.out.println(domesticatedAnimals);

        System.out.println(Arrays.toString(domesticatedAnimals));

        System.out.println(domesticatedAnimalsList);



    }
}
