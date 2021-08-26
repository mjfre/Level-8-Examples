package chapter_5.overloading;


//Overloading

//Same method name
//Different parameters - number, type, or order

public class Airplane {

    public void travel(){
        System.out.println("Weeee we're traveling!");
    }

    public void travel(String cityDestination){
        System.out.println("Weeee we're traveling to " + cityDestination);
    }

    public void travel(int miles){
        System.out.println("We're traveling " + miles + " miles");
    }

    public void travel(String destination, boolean oneWay){
        System.out.println("Taking a " + (oneWay ? "one way " : "") + "flight to " + destination);
    }

    public void travel(boolean international, String destination){
        System.out.println("Taking a " + (international ? "international " : "") + "flight to " + destination);
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        airplane.travel("Stockholm", false);
    }

}
