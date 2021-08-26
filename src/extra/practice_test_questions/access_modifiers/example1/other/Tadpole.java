package extra.practice_test_questions.access_modifiers.example1.other;
import extra.practice_test_questions.access_modifiers.example1.animal.Frog;

public class Tadpole extends Frog {

    public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit();
//        t.jump();
        Frog f = new Tadpole();
//        f.ribbit();
//        f.jump();
        f.lick();
    }

}
