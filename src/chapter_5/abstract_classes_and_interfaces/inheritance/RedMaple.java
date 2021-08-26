package chapter_5.abstract_classes_and_interfaces.inheritance;

public class RedMaple extends Tree{

    @Override
    public final void grow() {
        System.out.println("I'm growing big red leaves!");
    }

    @Override
    public void produceSeeds() {
        System.out.println("Producing maple seeds!");
    }

    @Override
    public void soakUpSunlight() {
        System.out.println("Big red leaves are soaking up the sunlight");
    }

}
