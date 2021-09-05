package chapter_4.order_of_initialization;

public class OrderOfInitialization {

    public static void main(String[] args) {
        System.out.println(LeopardShark.environment);
        LeopardShark leopardShark = new LeopardShark(80);
        LeopardShark leopardShark1 = new LeopardShark(80);
        LeopardShark leopardShark2 = new LeopardShark(80);
    }

}
