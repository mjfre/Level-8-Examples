package chapter_5.superclass_references;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        NutCracker n = new NutCracker();
        n.crackNuts();
        n.giveJoyToChildren();

        Toy t = n;
        t.giveJoyToChildren();

        NutCracker n2 = (NutCracker) t;
        n2.crackNuts();


        NutCracker n3 = new NutCracker();
        RubiksCube r = new RubiksCube();

        List<Toy> santasBag = new ArrayList<Toy>();
        santasBag.add(n3);
        santasBag.add(r);

        for(Toy toy : santasBag){
            toy.giveJoyToChildren();
        }
    }

}
