package chapter_4.variable_arguments;

public class BadArrayParameter {

    public static void main(String[] args) {
        print(true, new boolean[]{true, true});
    }

    public static int print(boolean b, boolean... b2){
        return b2.length;
    }

}
