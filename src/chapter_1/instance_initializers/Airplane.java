package chapter_1.instance_initializers;

import java.time.LocalDate;

public class Airplane {

    String model;

    String orderedOn;

    {
        System.out.println("instance initializer 1");
        submitOrder();
    }

    public Airplane(String model) {
        System.out.println("constructor");
        this.model = model;
    }

    {
        System.out.println("instance initializer 2");
    }

    public void submitOrder(){
        this.orderedOn = LocalDate.now().toString();
        System.out.println("Airplane ordered at " + orderedOn);
    }

}
