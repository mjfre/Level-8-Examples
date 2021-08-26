package chapter_5.polymorphism.classes;

public class Coffee extends Drink{

    public Coffee() {
        super("coffee");
    }

    public void spill() {
        System.out.println("You just spilled boiling coffee on your grandma.  Time to sue McDonald's");
    }

}
