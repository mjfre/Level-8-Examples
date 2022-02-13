package chapter_5.review_questions.question_7;

public class Runner {

    public static void main(String[] args) {

        //A
        Nut n = new Nut();
//        Hazelnut h = n;
//        Hazelnut h2 = (Hazelnut) n;

        Nut n2 = new Hazelnut();
        Hazelnut  h3 = (Hazelnut) n2;

        System.out.println(h3);

        //B
        pickNut(h3);

        //C
        pickObject(h3);

        //E
        h3.salt();
    }


    public static void pickNut(Nut nut){
        System.out.println("picking " + nut);
    }

    public static void pickObject(Object o){
        System.out.println("picking object " + o);
    }
}
