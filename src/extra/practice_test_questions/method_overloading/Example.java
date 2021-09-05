package extra.practice_test_questions.method_overloading;

public class Example {

    public void method(Object o){
        System.out.println("object");
    }

    public void method(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.method(null);
    }

}
