package chapter_5.hiding_vs_overriding.other_example;

public class Runner {

    public static void main(String[] args) {
        Shoes s = new FlipFlop();
        s.tieShoes();
//        s.snap();

        FlipFlop f = (FlipFlop) s;
        f.snap();

     }

}
