package chapter_4.pass_by_value;

import java.util.Locale;

public class Lion2 {

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new chapter_4.pass_by_value.Lion2().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }

}

