package extra;

import java.util.ArrayList;

public class ClassParameter {

    public static void main(String[] args) {
        test(String.class);
    }

    public static <T> ArrayList<T> test(Class<T> c){
        return new ArrayList<T>();
    }


}
