package extra.Math;

public class SmallTypePromotion {

    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 10;

        int i = b1 + b2;


        char c1 = 'a';
        char c2 = 'b';

        int i2 = c1 + c2;
        System.out.println((char)i2);

        System.out.println("" + c1 + c2);

        String s = Character.toString(c2) + c1;

        System.out.println(s);

    }
}
