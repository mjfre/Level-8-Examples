package extra;

import java.io.IOException;

public class CatchException {

    public static void main(String[] args) throws IOException {
        throwException2();
//
//        try{
//            System.out.println(s.charAt(1));
//        } catch(RuntimeException e){
//            e.printStackTrace();
//        }
    }

    public static void throwException(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void throwException2() throws IOException {
        throw new IOException();
    }
}
