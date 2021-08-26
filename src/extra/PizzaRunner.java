package extra;

public class PizzaRunner {

    public static void main(String[] args) {

        Pizza p1 = new Pizza(12, "Pepperoni");

        Pizza p2 = new Pizza(8, "Cheese");

        System.out.println(Pizza.getPizzeriaAddress());
    }

}
