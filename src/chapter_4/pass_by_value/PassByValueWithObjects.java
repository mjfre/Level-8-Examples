package chapter_4.pass_by_value;

public class PassByValueWithObjects {

    public static void main(String[] args) {
        int number = 90;
        add(number);
        System.out.println(number);

        StringBuilder sb2 = new StringBuilder("swan");
        addGoodbye(sb2);
        System.out.println(sb2);

        sb2 = new StringBuilder("swan");
        dontAddGoodbye(sb2);
        System.out.println(sb2);

        String s2 = "vulture";
        dontAddGoodbye2(s2);
        System.out.println(s2);
    }

    //primitive
    public static void add(int num){
        num += 10;
    }

    //mutable object
    public static void addGoodbye(StringBuilder sb){
        sb.append(" Goodbye");
    }

    //mutable object reassigned
    public static void dontAddGoodbye(StringBuilder sb){
        sb = new StringBuilder();
        sb.append(" Goodbye");
    }

    //immuatable object
    public static void dontAddGoodbye(String s){
        s.concat(" Goodbye");
    }

    //immutable object reassigned
    public static void dontAddGoodbye2(String s){
        s = s.concat(" Goodbye");
    }
}
