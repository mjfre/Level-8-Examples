package chapter_5.overriding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) throws IOException {
        List<Animal> animals = new ArrayList();

        animals.add(new Dolphin());
        animals.add(new Porcupine());

        for(Animal a :  animals){
            String s = a.speak();
        }
    }
}
