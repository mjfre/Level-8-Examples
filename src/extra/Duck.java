package extra;


class Bird {
    int age;

    public static void birdStuff(Bird bird){
        System.out.println("Hello from the bird class");
    }

}

public class Duck extends Bird {

    public static void duckStuff(Duck duck){
        System.out.println("Hello from the bird class");
    }

    public static void main(String[] args) {
        Bird bird = new Duck();
        birdStuff(bird);
    }
}

