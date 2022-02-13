package chapter_5.hiding_vs_overriding.book_example.extended;

class Marsupial {

    int pocketDepth = 5;

    int age = 5;

    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

}

