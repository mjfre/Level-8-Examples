package extra.Super;

public class House extends Building{

    int numberOfInhabitants;

    public House(int numberOfInhabitants){
        super("No address ");
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public static void main(String[] args) {
        House h = new House(5);
        h.address = "1233 N. East ave";
    }

}
