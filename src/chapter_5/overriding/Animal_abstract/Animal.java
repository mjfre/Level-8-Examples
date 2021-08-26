package chapter_5.overriding.Animal_abstract;

import java.io.IOException;
import java.util.Objects;

public class Animal {

    String species;
    int age = 10;

    public Animal(String species) {
        this.species = species;
    }

    void makeNoise(){
        System.out.println("making noise");
    }

    public void drink(){
        System.out.println("drinking water");
    }

    public static String timeSinceCreation(){
        return "800 million years ago";
    }

    public void provideAnimalHistory(){
        System.out.println("As an Animal, I was created " + timeSinceCreation());
    }

    public void move(){
        System.out.println("I'm moving!");
    }

    public void move(int distanceTravelledFeet){
        System.out.println("I'm moving " + distanceTravelledFeet + " feet");
    }

}
