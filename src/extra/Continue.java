package extra;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("start");
            if(true) {
                break;
            }
            System.out.println("finish");
        }
    }

}
