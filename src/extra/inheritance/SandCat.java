package extra.inheritance;

public class SandCat extends Animal{

    static String planet = "Mars";


    public SandCat(){
        this(0);
    }

    public SandCat(int age){
        super(age);
    }

    public static void massExtinction(){
        System.out.println("Aliens are massacring sand cats on " + getPlanet());
    }

    public static String getPlanet(){
        return planet;
    }

    public void die(){
        System.out.println("I'm drowning in the sand");
        super.die();
    }

    public void buildSandCastle(){
        System.out.println("I'm having so much fun");
    }

    public static void main(String[] args) {
        SandCat.massExtinction();
    }

}
