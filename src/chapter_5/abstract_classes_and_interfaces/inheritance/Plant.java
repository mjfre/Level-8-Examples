package chapter_5.abstract_classes_and_interfaces.inheritance;

public abstract class Plant implements ProducesChlorophyll{

    public abstract void grow();

    void soakUpSunLight(){
        System.out.println("I love sunlight");
    }

}
