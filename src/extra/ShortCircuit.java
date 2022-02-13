package extra;

public class ShortCircuit {

    static int someInt = 10;

    public static void changeInt(int a){
        a = 20;
    }

    public static void main(String[] args) {
        changeInt(someInt);
        System.out.println(someInt);
    }

}
