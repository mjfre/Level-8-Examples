package chapter_5.abstract_classes_and_interfaces.abstract_class_modifiers;

//cannot be private of final
public abstract class AbstractClassModifiers {

    int numberOfSwans = 5;

//    static final int numberOfFeetPerSwan;

//    {
//        numberOfSwans = 100;
//    }
//
//    static{
//        numberOfFeetPerSwan = 40;
//    }

    public void produceSwan(){
        numberOfSwans += 1;
    }

    //cannot be private or final
    public abstract void eatBirdFood();

}
