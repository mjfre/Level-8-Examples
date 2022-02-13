package chapter_5.polymorphism.animal_example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList();
        animals.add(new Bat());
        animals.add(new Armadillo());

        //reference types
        Bat bat = new Bat();
        bat.makeNoise();

        Animal animal4 = new Bat();
        animal4.makeNoise();

        //casting
//        animal4.useEcholocation();

        Bat bat2 =  (Bat) animal4;
        bat2.useEcholocation();


        List<Mammal> mammals = new ArrayList();
        mammals.add(new Bat());
        mammals.add(new Armadillo());

        for(Mammal m : mammals){
            String producedMilk = m.produceMilk();
        }

    }
}
