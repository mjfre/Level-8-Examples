package extra.CastingObjects;

import java.util.ArrayList;
import java.util.List;

public class Sandstone extends Rock {

    public Sandstone(int diameterMillimeters) {
        super(diameterMillimeters);
    }

    public List<Sandstone> crumble() {
        List<Sandstone> pieces = new ArrayList<>();
        pieces.add(new Sandstone(this.diameterMillimeters/2));
        pieces.add(new Sandstone(this.diameterMillimeters/2));
        return pieces;
    }

}
