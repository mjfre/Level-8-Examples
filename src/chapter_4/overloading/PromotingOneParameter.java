package chapter_4.overloading;

public class PromotingOneParameter {

    public static void print(double d1, double d2){
        System.out.println("double");
    }

    public static void print(float f1, float f2){
        System.out.println("float");
    }

    public static void main(String[] args) {
        print(2.0, 3.0f);
    }
}
