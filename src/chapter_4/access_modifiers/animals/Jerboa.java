package chapter_4.access_modifiers.animals;

public class Jerboa {

    public static void publicStaticMethod() {
    }

    protected static void protectedStaticMethod() {
    }

    static void defaultStaticMethod() {
    }

    private static void privateStaticMethod() {
    }

    public static void main(String[] args) {
        publicStaticMethod();
        protectedStaticMethod();
        defaultStaticMethod();
        privateStaticMethod();
    }
}
