package extra;

public class Ternary {

    public static void main(String[] args) {
        int luck = 10;

        System.out.println(luck>10 ? luck++ : --luck);

        if(luck>10){
            luck++;
        }
        else{
            --luck;
        }


    }
}
