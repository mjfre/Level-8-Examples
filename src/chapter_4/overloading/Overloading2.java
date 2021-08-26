package chapter_4.overloading;

import java.util.Date;

public class Overloading2 {
    public static void main(String[] args) {

    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + ", how is being " + age + " years old?");
    }

    public static  void sayHello(String name,  int age, Date birthday){

    }
}
