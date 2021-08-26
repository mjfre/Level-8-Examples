package chapter_5.polymorphism.classes;

public class Drink {

    String name;

    public Drink() {
        name = "drink";
    }

    public Drink(String name) {
        this.name = name;
    }

    public void spill(){
        System.out.println("You spilled whatever a drink is");
    }

    public String getName() {
        return name;
    }
}
