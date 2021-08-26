package chapter_6.new_or_broader_checked_exception;

public class Banana extends Fruit {

    public Banana(int ageDays) {
        super(ageDays);
    }

    public void eat(){
        if (ageDays > 14) {
            throw new RuntimeException();
        } else {
            System.out.println("Bananas are awesome!");
        }
    }

}
