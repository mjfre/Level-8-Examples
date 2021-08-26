package extra;

public class Pizza {

    int diameterInches;

    String topping;

    static double twelveInchPrice = 10.99;

    static double eightInchPizzaPrice = 7.99;

    public static String getPizzeriaAddress(){
        return "1999 E. North st. Pensacola Fl.";
    }

    public Pizza(int diameterInches, String topping) {
        this.diameterInches = diameterInches;
        this.topping = topping;
    }

}
