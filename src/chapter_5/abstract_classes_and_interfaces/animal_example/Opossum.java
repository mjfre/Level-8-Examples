package chapter_5.abstract_classes_and_interfaces.animal_example;

public class Opossum extends Animal implements EatsTrash{

    public String makeNoise() {
        return "hissssssss";
    }

    public void eatFavoriteTrashFood() {
        knockOverTrashcan();
        System.out.println("YUMMMM.  That McDouble had " + EatsTrash.CALORIES_IN_A_MCDOUBLE + " calories!");
    }

}
