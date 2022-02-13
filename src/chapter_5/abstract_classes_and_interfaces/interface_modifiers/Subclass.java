package chapter_5.abstract_classes_and_interfaces.interface_modifiers;

public class Subclass implements InterfaceModifier{


    public static void main(String[] args) {
        InterfaceModifier.sayHello();
        System.out.println(InterfaceModifier.NUMBER_OF_SQUIRRELS);
    }

    @Override
    public int sayGoodbye() {
        return 0;
    }

}
