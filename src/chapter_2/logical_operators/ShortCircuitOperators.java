package chapter_2.logical_operators;

public class ShortCircuitOperators {

    public static void main(String[] args) {

        int x = 5;

        if(x > 10 && x++ == 5){

        }
        System.out.println(x);

        String studentSchool = null;

        if(studentSchool != null && studentSchool.contains("High School")){

        }

    }
}
