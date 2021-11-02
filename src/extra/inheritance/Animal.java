package extra.inheritance;

public class Animal {

    protected int age;

    boolean alive;

    static int numberOfAliveAnimals;

    static String planet = "Earth";


    public Animal(int age){
        this.age=age;
    }

    public static String getPlanet(){
        return planet;
    }

    public void die(){
        System.out.println("I'm dying");
        this.alive=false;
    }

    public static void massExtinction(){
        System.out.println("An asteroid is heading towards " + getPlanet());
    }

}
