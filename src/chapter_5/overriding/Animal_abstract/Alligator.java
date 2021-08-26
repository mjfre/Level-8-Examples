package chapter_5.overriding.Animal_abstract;

public class Alligator extends Animal {

    public Alligator(){
        super("alligator");
    }

    @Override
    void makeNoise() {
        System.out.println("BELLOWING");
    }

    public void drink(){
        System.out.println("drinking Gatorade");
    }

    public static String timeSinceCreation(){
        return "37 million years ago";
    }

    public void provideAlligatorHistory(){
        System.out.println("As an alligator, I was created " + timeSinceCreation());
    }

    public void move(String cityName){
        System.out.println("I'm moving to " + cityName);
    }

    public void doDeathRoll(){
        System.out.println("I'm biting off your leg");
    }

    public static void main(String[] args) {
        Alligator ally = new Alligator();

        ally.provideAlligatorHistory();
        ally.provideAnimalHistory();
    }
}
