package chapter_4.access_modifiers.plants;

public class Runner {

    public static void main(String[] args) {
        Bromeliad b = new Bromeliad();
        b.publicMethod();
        b.protectedMethod();
        b.defaultMethod();
    }
}
