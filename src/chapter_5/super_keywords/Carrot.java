package chapter_5.super_keywords;

public class Carrot extends Vegetable{

    String name = "Carrot";

    public Carrot(double weightInKg) {
        //parent class constructor
        super(weightInKg);
    }

    public static void releaseOxygen(){
        System.out.println("My 02 is orange!");
    }

    public void doCarrotThings(){
        //parent class hidden method
        super.releaseOxygen();

        //parent class hidden variable
        System.out.println(super.name);
        super.name = "trash";
    }

    public String getName(){
        //parent class overridden method
        return super.getName();
    }

    public static void main(String[] args) {
        Carrot c = new Carrot(20.4);
        c.doCarrotThings();
        System.out.println(c.getName());
    }

}
