package chapter_5.hiding_vs_overriding.other_example;

public class FlipFlop extends Shoes{

    public static boolean hasLaces(){
        return false;
    }

    public void snap(){
        System.out.println("Flip flop broke! :(");
    }

}
