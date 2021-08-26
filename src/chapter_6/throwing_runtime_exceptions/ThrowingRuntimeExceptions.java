package chapter_6.throwing_runtime_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowingRuntimeExceptions {

    public static void main(String[] args) {

    }

    public static int divide(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException();
        }
        else return a/b;
    }

    public static int checkedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

}
