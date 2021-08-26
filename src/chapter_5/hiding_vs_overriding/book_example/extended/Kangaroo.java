package chapter_5.hiding_vs_overriding.book_example.extended;

public class Kangaroo extends Marsupial {

    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Marsupial m = new Kangaroo();
        m.getMarsupialDescription();
//        m.getKangarooDescription();

        Kangaroo k = (Kangaroo) m;
        k.getKangarooDescription();

    }

}
