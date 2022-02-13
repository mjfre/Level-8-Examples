package chapter_6.try_catch;

import java.io.IOException;

public class TryCatch {


    public static void main(String[] args) {

        try {
            throw new Exception();
//            throwException();
//            try {
//                throw new Exception();
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            } finally {
//                System.out.println("out");
//            }
        } catch (IOException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }

    public static void throwException() throws IOException {
        throw new IOException();
    }

}
