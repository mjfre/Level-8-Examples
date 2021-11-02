package chapter_4.order_of_initialization;

import java.rmi.dgc.Lease;

import static chapter_4.order_of_initialization.LeopardShark.environment;

public class OrderOfInitialization {

    public static void main(String[] args) {

        System.out.println(environment);
        LeopardShark l = new LeopardShark(5);
        LeopardShark l1 = new LeopardShark(5);
        LeopardShark l2 = new LeopardShark(5);
    }

}
