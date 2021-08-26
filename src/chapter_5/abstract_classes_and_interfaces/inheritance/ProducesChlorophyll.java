package chapter_5.abstract_classes_and_interfaces.inheritance;

public interface ProducesChlorophyll extends HasCells{

    void soakUpSunlight();

    default void absorbNutrients(){
        System.out.println("yumm");
    }

}
