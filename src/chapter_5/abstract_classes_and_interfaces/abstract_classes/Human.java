package chapter_5.abstract_classes_and_interfaces.abstract_classes;

public class Human implements Whistler, Musician {

    public void whistle() {

    }

    @Override
    public void sayHello() {
        System.out.println("hi from human");
    }

    public void speak() {

    }

    public void driveACar(){

    }



}
