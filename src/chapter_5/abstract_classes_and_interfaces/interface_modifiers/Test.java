package chapter_5.abstract_classes_and_interfaces.interface_modifiers;

public class Test implements InterfaceModifier{

    public static void main(String[] args) {
        InterfaceModifier.sayHello();
    }


    @Override
    public int sayGoodbye() {
        return 0;
    }

    @Override
    public void printWhiteHouseAddress() {

    }
}
