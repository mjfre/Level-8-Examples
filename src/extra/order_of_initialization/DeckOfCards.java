package extra.order_of_initialization;

import java.util.List;

public class DeckOfCards{

    List<String> cards;

    final static double price;

    static{
        System.out.println("static initializer");
        price = 5.25;
    }

    {
        System.out.println("instance initializer 1");
    }

    public DeckOfCards() {
        System.out.println("constructor");
    }

}
