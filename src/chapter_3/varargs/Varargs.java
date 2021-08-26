package chapter_3.varargs;

public class Varargs {

    public static void main(String... potatoSalad) {

        eatVegetables("potatoes", "green beans", "corn");

        String[] stuff = {"squash", "pumpkins"};

        eatVegetables(stuff);

    }

    public static void eatVegetables(String... vegetables){
        for (String vegetable : vegetables){
            System.out.println(vegetable);
        }
    }

}
