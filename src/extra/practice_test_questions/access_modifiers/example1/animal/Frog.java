package extra.practice_test_questions.access_modifiers.example1.animal;

import extra.practice_test_questions.access_modifiers.example1.other.Tadpole;

public class Frog {

    protected void ribbit() {}
    void jump() {}

    public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit();
//        t.jump();
        Frog f = new Tadpole();
        f.ribbit();
        f.jump();
    }

}
