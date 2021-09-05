package chapter_5.super_keywords;

public class Vegetable {

    double weightInKg;

    String name = "vegetable";

    public Vegetable(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public static void releaseOxygen(){
        System.out.println("Here comes the 02!");
    }

    public String getName(){
        return "I'm a vegetable called " + this.name;
    }

}
