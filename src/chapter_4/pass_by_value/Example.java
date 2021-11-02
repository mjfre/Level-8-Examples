package chapter_4.pass_by_value;

public class Example {

    public static void addSuffix(String s, StringBuilder sb, int x) {
        s = s.concat("ed");
        sb.append("ed");
        x += 5;
    }

    public static void main(String[] args) {
        String s = "pass";
        StringBuilder sb = new StringBuilder("pass");
        int x = 5;
        addSuffix(s, sb, x);
        System.out.println(s + " " + sb);
    }

}
