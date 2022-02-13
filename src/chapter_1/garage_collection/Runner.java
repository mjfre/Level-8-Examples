package chapter_1.garage_collection;

public class Runner {

    public static void main(String[] args) {
        Cat c = new Cat();
        c = null;

        System.gc();

    }


}
