package chapter_4.variable_arguments;

public class VariableArguments {

    public static void main(String[] args) {
        String[] animals = {"Puma", "Lion", "Cougar" };

//        print(animals);

        printVarArgs("Puma", "Lion", "Cougar");
    }

    static public void print(String[] animals){
        System.out.println(animals[0]);
        for(String animal : animals){
            System.out.println(animal);
        }
    }

    static public void printVarArgs(String... animals){
        System.out.println(animals[0]);
        for(String animal : animals){
            System.out.println(animal);
        }
    }
}
