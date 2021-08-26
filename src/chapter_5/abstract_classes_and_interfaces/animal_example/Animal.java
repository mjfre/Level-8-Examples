package chapter_5.abstract_classes_and_interfaces.animal_example;

public abstract class Animal {

    String name;

    public String sayHello(){
        return "Hello, " + name;
    }

    public abstract String makeNoise();

}
