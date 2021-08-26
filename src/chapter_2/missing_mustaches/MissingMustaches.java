package chapter_2.missing_mustaches;

public class MissingMustaches {

    public static void main(String[] args) {

        int x = 1 ;

        if (x == 0)
            System.out.println("x is 0!");
            System.out.println("It really is 0");

        for (int i = 0; i < 5; i++)
            System.out.println(i);
            System.out.println("hello");


        int i =0;
        do i++;
        while(i<10);
        System.out.println(i);

        for (int j = 0; j < 10; j++)
            for (int k = 0; k < 10; k++)
                System.out.println("hello");
                System.out.println("goodbye");



    }
}
