package chapter_4.static_context;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Pizza {

    {
        System.out.println("instance initializer");
        stuffedCrust = true;
        priceForLargePizza = 17.77;

    }

    static {
        System.out.println("static initializer");
        System.out.println("someone mentioned Pizza");
    }

    public Pizza() {
        System.out.println("constructor");
    }

    //member variable aka instance variable aka field
    private List<String> toppings;
    private int diameterInches;
    private boolean stuffedCrust;

    //static variable aka class variable

    static double priceForLargePizza = 14.00;
    static String pizzeriaAddress = "1567 Canyon Crest Dr. San Diego, CA";

    static public void changeLargePizzaPrice(double newPrice){
//        diameterInches = 20;
        priceForLargePizza = newPrice;
    }

    public void setToppings(String... toppings){
        priceForLargePizza = 199.00;
        this.toppings = asList(toppings);
    }

    public List<String> getToppings() {
        return toppings;
    }

    public int getDiameterInches() {
        return diameterInches;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    public static double getPriceForLargePizza() {
        return priceForLargePizza;
    }

    public static String getPizzeriaAddress() {
        return pizzeriaAddress;
    }
}
