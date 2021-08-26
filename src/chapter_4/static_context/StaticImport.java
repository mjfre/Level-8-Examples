package chapter_4.static_context;

import java.time.Month;

import static javax.swing.JOptionPane.showMessageDialog;

import static java.time.Month.*;

public class StaticImport {

    public static void main(String[] args) {
        showMessageDialog(null, "hello");

        System.out.println(JANUARY);
    }

}
