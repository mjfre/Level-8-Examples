package chapter_5.hiding_vs_overriding.book_example.extended;

public class Kangaroo extends Marsupial {

    boolean canHop = true;
    boolean isBiped = true;
    int age = 10;

    public boolean isBiped() {
        System.out.println(super.age);
        System.out.println(age);
        return isBiped;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Marsupial m = new Kangaroo();
        m.getMarsupialDescription();
//        m.getKangarooDescription();
        System.out.println(m.pocketDepth);
        System.out.println(m.age);

        Kangaroo k = (Kangaroo) m;
        k.getKangarooDescription();
        System.out.println(k.canHop);
        System.out.println(k.age);
    }

}
