package extra;

public class AssignmentInsteadOfComparison {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = true;

        if(a = b){
            System.out.println("true");
        }

        if(num() == 5){
            System.out.println("true");
        }
    }

    public static int num(){
    return 5;
    }
}
