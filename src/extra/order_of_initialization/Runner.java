package extra.order_of_initialization;

public class Runner {

    public static void main(String[] args) {
        System.out.println(DeckOfCards.price);
        DeckOfCards d = new DeckOfCards();
        DeckOfCards d2 = new DeckOfCards();
    }
}
