package extra.ExendingClassWithNoNoArgumentConstructor;

public class Ostrich extends Animal{

    public Ostrich(){
        super("Ostrich");
    }

    public Ostrich(String name){
        super("Ostrich");
        this.name = name;
    }
}
