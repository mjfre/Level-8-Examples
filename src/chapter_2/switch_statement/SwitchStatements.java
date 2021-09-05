package chapter_2.switch_statement;


import javax.swing.*;

/*
p 72
Supported types:
int and Integer
byte and Byte
short and Short
char and Character
enum values
String
 */
public class SwitchStatements {

    public static void main(String[] args) {


//        int tooManyCats = Integer.parseInt(JOptionPane.showInputDialog("How many cats is too many?"));
//        int tooManyCats = 4;
        final int tooManyCats = 10;

        int numCats = 0;

        switch (numCats) {
            case 0:
            case 1:
                System.out.println("That's a good number of cats");
                break;
            case tooManyCats:
            default:
                System.out.println("Something else about cats");
                System.out.println("That's too many cats!");
                break;

        }

        int[] a = {4, 5,  6};
        int[] b = {4, 5,  6};
        a.equals(b);

    }
}
