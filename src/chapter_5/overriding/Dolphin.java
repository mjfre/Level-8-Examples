package chapter_5.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Dolphin extends Animal {

    public String speak(){
            return "EEEEeeeEEEEEeeEEeEeeEEEEeeEEeEEEe";
        }

    public void doFrontflip(){
        System.out.println("Doing a back flip");
    }

    public static void main(String[] args) {
        Dolphin d = new Dolphin();
        System.out.println(d.speak());
    }

}
