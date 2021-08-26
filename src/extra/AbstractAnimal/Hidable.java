package extra.AbstractAnimal;

public interface Hidable {

    public static final int undetectableDistanceMeters = 100;

    String camoColor = "green";

    void stalk();

    default void pounce(){

    }


}
