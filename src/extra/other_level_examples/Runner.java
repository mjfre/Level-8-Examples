package extra.other_level_examples;

public class Runner {

    public static void main(String[] args) {

        BowlingLane bowlingLane = new BowlingLane();

        bowlingLane.strike();

        System.out.println(bowlingLane.getNumberOfActivePins());

        BowlingLane bowlingLane1 = new BowlingLane();

        System.out.println(bowlingLane1.getNumberOfActivePins());

        BowlingLane bowlingLane2 = new BowlingLane();

        System.out.println(bowlingLane2.getNumberOfActivePins());

        System.out.println(BowlingLane.pinWeightPounds);

    }
}
