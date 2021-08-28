package chapter_3.string_pool;


//https://kwiki.westus.cloudapp.azure.com/en/technical/java-strings

import java.util.Random;

public class StringPool {

    static public void main(String[] args) {

        String a = "potato salad";
//        String b = "potato salad";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//
//        System.out.println("potato salad" == a);
//        System.out.println("potato salad" == "potato salad".toString());
//
//
//        StringBuilder sb = new StringBuilder("potato salad");
//        System.out.println(sb.toString() == a);
//        System.out.println("potato salad" == sb.toString());
//
//
//        String d = new String("potato salad");
//        System.out.println(d == a);


        String c = "potato";
        c += " salad";
        System.out.println(c == a);


//        String e = "potato " + "salad";
//        System.out.println(e == a);


        c = c.intern();
        System.out.println(c == a);

    }
}
