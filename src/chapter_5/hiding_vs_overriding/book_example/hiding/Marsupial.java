package chapter_5.hiding_vs_overriding.book_example.hiding;

public class Marsupial {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

}
