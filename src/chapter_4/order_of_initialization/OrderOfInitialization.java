package chapter_4.order_of_initialization;

import java.rmi.dgc.Lease;

public class OrderOfInitialization {

    public static void main(String[] args) {
        LeopardShark l = new LeopardShark(5);
    }

}
