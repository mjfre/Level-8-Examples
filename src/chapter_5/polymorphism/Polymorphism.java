package chapter_5.polymorphism;

import chapter_5.polymorphism.classes.Coffee;
import chapter_5.polymorphism.classes.Drink;
import chapter_5.polymorphism.classes.Lemonade;
import chapter_5.polymorphism.classes.Water;

public class Polymorphism {

    //question 6 - chapter review
    public static void main(String[] args) {
        //a
        Drink d = new Drink();
        //Lemonade l = d;

        //could provide superclass reference
        Lemonade l = new Lemonade();
        Drink d1 = l;

        //could cast to subclass object - if the the object is actually of that type
        Drink d3 = new Lemonade();
        Lemonade l2 = (Lemonade) d3;

        //b
        printDrinkName(new Drink());
        printDrinkName(new Water());
        printDrinkName(new Lemonade());
        printDrinkName(new Coffee());

        //c
        printIsDrink(new Coffee());

        //d
//        Lemonade l3 = (Lemonade) d;

        //e
        Drink d4 = new Coffee();
        d4.spill();

    }

    public static void printDrinkName(Drink d){
        System.out.println(d.getName());
    }

    public static void printIsDrink(Object o){
        System.out.println(o instanceof Drink);
    }

}
