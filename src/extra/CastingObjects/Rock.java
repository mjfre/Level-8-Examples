package extra.CastingObjects;

public class Rock {

    int diameterMillimeters;

    public Rock(int diameterMillimeters) {
        this.diameterMillimeters = diameterMillimeters;
    }

    public void erode(){
        diameterMillimeters -= 10;
    }

}
