package chapter_4.pass_by_value;

import java.util.Arrays;

public class SimpleExample {

    public static void main(String[] args) {

//        int a = 5;
//        doubleNumber(a);
//        System.out.println(a);

        Cat c = new Cat();
        removeLife2(c);
        System.out.println(c.numLives);
//
//        String s = "water";
//        capitalize(s);
//        System.out.println(s);
//
//        int[] nums = {2,4,6,8};
//        multiplyEachElementByTwo(nums);
//        System.out.println(Arrays.toString(nums));

    }

    public static void doubleNumber(int num){
        num = num * 2;
    }

    static public void doubleNumbr(int a){

    }

    public static void removeLife(Cat cat){
        cat.numLives -= 1;
    }

    public static void removeLife2(Cat cat){
        cat = new Cat();
        cat.numLives -= 1;
    }

    public static void capitalize(String s2){
        s2 = s2.toUpperCase();
    }

    public static void multiplyEachElementByTwo(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*2;
        }
    }

}

class Cat{

    int numLives = 9;

}
