package chapter_2.ternary_operator;

import java.util.Locale;

public class TernaryOperator {

    public static void main(String[] args) {

        int age = 59;
        String message = age < 18 ? "you're not old enough to vote" : "who are you voting for?";
//        System.out.println(message);


        if (age < 18) {
            message = "you're not old enough to vote";
        } else {
            message = "who are you voting for?";
        }
//        System.out.println("message");


        String tiger = "tiger";
        String lion = "lion";

//        final String statement = 250  > 338 ? lion : tiger = " is bigger";

//        System.out.println(statement);
//        System.out.println(tiger);


        String name = null;

        String myFavoritePerson = name != null ? name : "name not found";
//        System.out.println(myFavoritePerson.toUpperCase());


        String animal = "cat";
        int animalAge = 1;

        if (animal.equals("cat")) {
            if (animalAge < 2) {
//                System.out.println("You're a kitten!");
            } else {
//                System.out.println("You're an adult cat!");
            }
        } else {
//            System.out.println("You're a different animal!");
        }

        String output = animal.equals("cat") ? animalAge < 2 ? "you're a kitten!" : "you're an adult cat!" : "You're a different animal";

//        System.out.println(output);

    }

}
