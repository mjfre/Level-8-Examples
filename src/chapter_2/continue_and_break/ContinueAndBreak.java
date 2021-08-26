package chapter_2.continue_and_break;

public class ContinueAndBreak {

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

//
//        for (int i = 0; i < 100; i++) {
//            if(i==2){
//                break;
//            }
//            System.out.println(i);
//        }


        outer: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }

    }

}
