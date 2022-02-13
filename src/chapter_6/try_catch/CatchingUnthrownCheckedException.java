package chapter_6.try_catch;

import java.io.IOException;

public class CatchingUnthrownCheckedException {

    public static void main(String[] args) {
        try{
            amethod();
            System.out.println("try");
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("out");
    }

    public static void amethod(){

    }
}
