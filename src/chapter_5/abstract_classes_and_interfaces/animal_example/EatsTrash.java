package chapter_5.abstract_classes_and_interfaces.animal_example;

public interface EatsTrash {

    public static final int CALORIES_IN_A_MCDOUBLE = 400;

    public abstract void eatFavoriteTrashFood();

    public default void knockOverTrashcan(){
        System.out.println("BANG! the trashcan is knocked over");
    }

}
