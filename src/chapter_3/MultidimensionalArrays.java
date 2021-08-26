package chapter_3;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        String[] rodents = {"capybara", "rat", "mouse", "prairie dog"};

        String[] mammals = {"whale", "cat", "elephant", "bat"};

        String[] amphibians = {"frog", "salamander", "new", "toad"};

        String[][] animals = new String[3][4];

        animals[0] = rodents;

        animals[1] = mammals;

        animals[2] = amphibians;

        System.out.println(animals[1][2]);

    }
}
