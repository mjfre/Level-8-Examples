package extra.importsf.vehicle;

public class Vehicle {

    public static boolean canMove = true;

    public static void makeNoise(){
        System.out.println("honk!");
    }

    public void publicMove(){
        System.out.println("i'm moving!");
    }

    protected void protectedMove(){
        System.out.println("i'm moving!");
    }

    void defaultMove(){
        System.out.println("i'm moving!");
    }

    private void privateMove(){
        System.out.println("i'm moving!");
    }


}
