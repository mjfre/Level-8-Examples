package extra.junks;

public class ArrayBasics {

    public static void main(String[] args) {

        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "orange";

//        System.out.println(fruits[1]);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        String[] animals = {"cat", "dog", "mule"};

    }

}
