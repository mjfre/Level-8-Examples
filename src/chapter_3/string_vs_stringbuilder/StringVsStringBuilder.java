package chapter_3.string_vs_stringbuilder;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        String a = "palm tree";
        a = a.toUpperCase();
        System.out.println(a);


        //immutable
        String s = "counting: ";

        for (int i = 1; i <= 1000; i++) {
            s += i + " ";
        }

        //mutable
        StringBuilder sb = new StringBuilder("counting: ");

        for (int i = 1; i <= 1000; i++) {
            sb.append(i).append(" ");
        }

        String output = sb.toString();

    }

}
