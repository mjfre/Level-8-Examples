package extra.other_level_examples;

public class BowlingLane {

    private int numberOfActivePins = 12;

    public static int pinWeightPounds = 4;

    public void strike(){
        this.numberOfActivePins = 0;
    }

    public int getNumberOfActivePins() {
        return numberOfActivePins;
    }

    public void setNumberOfActivePins(int numberOfActivePins) {
        this.numberOfActivePins = numberOfActivePins;
    }

}
