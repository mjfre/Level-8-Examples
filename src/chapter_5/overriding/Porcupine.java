package chapter_5.overriding;

import chapter_5.overriding.Animal;

public class Porcupine extends Animal {


    public String speak(){
        return "shrill screech";
    }

    public void poke(){
        System.out.println("ouch!");
    }
}
