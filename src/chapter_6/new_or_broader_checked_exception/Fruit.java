package chapter_6.new_or_broader_checked_exception;

import java.io.IOException;

public class Fruit {

    int ageDays;

    public Fruit(int ageDays) {
        this.ageDays = ageDays;
    }

    public void eat(){
        System.out.println("This fruit is tasty!");
    }

}
