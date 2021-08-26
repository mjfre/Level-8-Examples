package extra.other_level_examples.inheritance;

public class Dragon extends Animal{

    //overriding
    public void makeNoise(){
        System.out.println("RRRRRRRRAARRARAR");
    }

    //overloading
    public void makeNoise(String name){
        System.out.println("RARARARRRARRR " + name + "!");
    }

}
