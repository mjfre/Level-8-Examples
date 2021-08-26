package chapter_2.logical_operators;

public class AndOr {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = true;

        if(b1 & b2){
            System.out.println("true!");
        }

        String s = null;

        if(s!=null ^ s.equals("hello")){
            System.out.println("true!");
        }

    }
}
