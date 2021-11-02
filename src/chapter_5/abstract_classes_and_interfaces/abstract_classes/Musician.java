package chapter_5.abstract_classes_and_interfaces.abstract_classes;

public interface Musician {

    public default void sayHello(){
        System.out.println("hello from whistler");
    }

}


