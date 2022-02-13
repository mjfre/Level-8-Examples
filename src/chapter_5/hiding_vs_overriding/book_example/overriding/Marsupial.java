package chapter_5.hiding_vs_overriding.book_example.overriding;

class Marsupial {

    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

}

