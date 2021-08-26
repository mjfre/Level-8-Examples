package chapter_5.abstract_classes_and_interfaces.interface_modifiers;

public interface InterfaceModifier {

    //all interface variables are public, static, and final
    public final static int NUMBER_OF_SQUIRRELS = 5;

    //static interface methods are not inherited
    public static void sayHello(){
        System.out.println("hello");
    }

    //all non-default method are assumed abstract and public, and cannot be private, protected, or final
    int sayGoodbye();

    //A default method must be marked with the default keyword
    //A default method is not assumed to be static, final, or abstract as it may be used or overridden by a class that implements the interface.
        //cannot be static
        //cannot be final
    //A default method is assumed to be public and will not compile if marked as private or protected.
    default void printWhiteHouseAddress(){
        System.out.println("1600 Pennsylvania Avenue");
    }

}

