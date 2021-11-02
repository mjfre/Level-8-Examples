package extra.importsf.bicycle;

import extra.importsf.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

import static extra.importsf.vehicle.Vehicle.*;
import static extra.importsf.vehicle.Airship.*;

public class Bicycle {

    public static void main(String[] args) {
//        makeNoise();
//        System.out.println(canMove);


        List<String> s1 = new ArrayList<>();
        s1.add("apple");
        s1.add("banana");

        List<String> s2 = new ArrayList<>();
        s2.add("apple");
        s2.add("banana");

        System.out.println(s1.equals(s2));

    }

}
