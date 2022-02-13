package chapter_5.casting_objects;

public class Runner {

    public static void main(String[] args) {

        Animal a = new Animal();

        //superclass reference
        Animal george = new Snail();
        //george.slime();
        Snail george2 = (Snail) george;
        george2.slime();


        Animal a2 = new Animal();
        Snail a3 = (Snail) a2;



    }


}
