package chapter_6.try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowingAdditionalExceptions {

    public static void main(String[] args) throws IOException {
        try{
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e){
            throw new IOException();
        }
        catch(IOException e){
            System.out.println("hello");
            e.printStackTrace();
        }
        finally{
            System.out.println("finally");
        }
    }
}
