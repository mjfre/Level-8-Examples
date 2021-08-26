package chapter_1.garage_collection;

public class GarbageCollection {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = c1;
        c2 = null;
        c1 = null;
        System.gc();
        c3 = null;
        System.out.println(c3);

        int x = 4;

//        System.out.println(true ? cat() : c1 = new Cat());
    }

    public static boolean cat(){
        return true;
    }

}
