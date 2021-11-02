package chapter_4.order_of_initialization;

public class LeopardShark {

    //static initializers
    //instance initializers
    //constructor

    int numSpots;

    final static String environment;

    public LeopardShark(int numSpots) {
        this.numSpots = numSpots;
        System.out.println("constructor");
    }

    static {
        environment = "ocean";
        System.out.println("static initializer");
    }

    {
        numSpots = 16;
        System.out.println("instance initializer");
    }

}
