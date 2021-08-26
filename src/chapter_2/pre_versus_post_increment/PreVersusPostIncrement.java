package chapter_2.pre_versus_post_increment;

public class PreVersusPostIncrement {

    public static void main(String[] args) {

//        int x = 0;

//        System.out.println(x);
//
//        System.out.println(x++);
//
//        System.out.println(x);
//
//        System.out.println(++x);


//        int x = 0;
//        int y = 5;
//
//        y = y + ++x;
//        System.out.println(x);
//        System.out.println(y);
//
//

//        int x = 0;
//        int y = 5;
//        y = y++ + x++ +y;
//        System.out.println(x);
//        System.out.println(y);

        //p 59
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

//
//
//        System.out.println(4 * 5 / 4 + 2);


        int z = 5;
        int z2 = z-- == 5 ? z : 0;

        System.out.println(z2);


        int age = 15;

//        System.out.println("Happy birthday!  You were " + age++ + " years old!  In ten years you will be " + (--age + 11));

    }

}
