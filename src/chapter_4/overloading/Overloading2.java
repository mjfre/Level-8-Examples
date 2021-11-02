package chapter_4.overloading;

import java.util.Date;

public class Overloading2 {

    public static void main(String[] args) {
        print(null);
    }

    public static void print(Object o){
        System.out.println("Object");
    }

    public static void print(String s){
        System.out.println("String");
    }

}
