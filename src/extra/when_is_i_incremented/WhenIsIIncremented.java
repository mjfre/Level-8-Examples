package extra.when_is_i_incremented;

public class WhenIsIIncremented {
    public static void main(String[] args) {
        loop: for (int i = 0; i < 5; ) {
            System.out.println(i);
            continue loop;
        }
    }
}
