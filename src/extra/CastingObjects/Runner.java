package extra.CastingObjects;

public class Runner {

    public static void main(String[] args) {

//        Object o = new Object();
//
//        Rock r = (Rock) o;

        Rock r = new Sandstone(10);

        r.erode();
//        r.crumblbe();


        Sandstone s = (Sandstone) r;
        s.crumble();

    }

}
