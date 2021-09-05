package extra.practice_test_questions.method_overloading;

public class Chicken {

    //Exact match
    //larger primative
    //autoboxing
    //varargs
    private void layEggs(int... eggs){
        System.out.println("many " + eggs[0] + "");
    }

    private void layEggs(int eggs){
        System.out.println("one " + eggs + " ");
    }

    private void layEggs(Integer eggs){
        System.out.println("Integer " + eggs + " ");
    }

    public static void main(String[] args) {
        Chicken c = new Chicken();
        c.layEggs(1, 2);
        c.layEggs(3);
//        c.layEggs(null);
    }
}
