package chapter_5.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Animal {

    public String speak() throws FileNotFoundException {
        return "Hello, I'm an animal!";
    }

}
