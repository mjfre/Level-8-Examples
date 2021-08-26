package chapter_2.primitive_promotion;

public class Promotion {

    /*

    p 55

    double -  64
    float - 32
    long - 64
    int - 32
    char
    short
    boolean/byte

    dflicsb

    https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html

    byte to short, int, long, float, or double

    short to int, long, float, or double

    char to int, long, float, or double

    int to long, float, or double

    long to float or double

    float to double


        Bird bird = (Duck) new Bird();

        Bird bird = new Duck();


195
promotion, autoboxing precedence

     */
    public static void main(String[] args) {

        char c = 24;


        int x = 5;
        float f = x;

        double d = 4.5545;
        int i = (int) d;
        System.out.println(i);

        //1. If two values have different data types, Java will automatically promote one of the val- ues to the larger of the two data types.
        int a = 10;
        double b = 23.34;
        double e = a + b;

        //3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
        short s1 = 2;
        short s2 = 10;
        int s3 = s1 + s2;

    }
}
