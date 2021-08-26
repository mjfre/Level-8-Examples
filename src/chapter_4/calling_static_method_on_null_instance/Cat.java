package chapter_4.calling_static_method_on_null_instance;

public class Cat {

    public static void print() {
        System.out.println("This is the cat class");
    }

    public static void main(String[] args) {
        Cat c = null;
        c.print();
    }
}
