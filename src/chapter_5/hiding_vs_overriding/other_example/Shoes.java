package chapter_5.hiding_vs_overriding.other_example;

public class Shoes {

    public boolean hasLaces(){
        return true;
    }

    public void tieShoes(){
        if(hasLaces()){
            System.out.println("Tying shoes");

        }
        else{
            System.out.println("These shoes DO NOT have laces");
        }
    }

}
