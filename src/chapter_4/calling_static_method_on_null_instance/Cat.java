package chapter_4.calling_static_method_on_null_instance;

public class Cat {

    public static void print() {
        System.out.println("This is the cat class");
    }

    public static void main(String[] args) {
        Cat c = null;
        c.print();


        short s = 4;
        byte b = 4;
        char a = 97;

        long l = 3;
        double d = 3;
        float f = 4;

//        boolean b = 0;


        System.out.println(a);

    }
}
