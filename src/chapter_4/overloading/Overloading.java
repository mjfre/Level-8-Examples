package chapter_4.overloading;


import java.util.ArrayList;
import java.util.List;

/*
ELAV
p 195
 */

public class Overloading {

    public static void main(String[] args) {
        int i = 4;
        test(i);
    }

    public static void test(double d){
        System.out.println("double");
    }

    public static void test(Integer d){
        System.out.println("Integer");
    }

    public static void test(int... nums){
        System.out.println("varargs");
    }

}
