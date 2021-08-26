package chapter_2.chapter_review;

import javax.swing.*;

public class ChapterReview {

    public static void main(String[] args) {
        //q 7
//        int x = 5;
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

        //q 8

        //&&  || - short-circuit operators
        //  if ( false && true )
        //  if ( true && false )


//        int x = 5;
//        if (x < 5 && x++ < 10){
//
//        }
//        System.out.println(x);

//        boolean x = true, z = true;
//        int y = 20;
//        x = (y != 10) ^ (z = false);
//        System.out.println(x + ", " + y + ", " + z);


        //q 18
//        int count = 0;
//        ROW_LOOP: for (int row = 1; row <= 3; row++)
//            for (int col = 1; col <= 2; col++) {
//                if (row * col % 2 == 0) continue ROW_LOOP;
//                count++;
//            }
//        System.out.println(count);

            /*
            count row column
            0       1   1
            1       1   2
            1       2   1
            1       3   1
            2       3   2
            2       4   1
             */


        //q 19
        int m = 9, n = 1, x = 0;
        while(m > n) {
            m--;
            n += 2;
            x += m + n;
        } System.out.println(x);

        /*
        m   n   x
        9   1   0
        8   3   11
        7   5   23
        6   7   36
         */
    }
}
