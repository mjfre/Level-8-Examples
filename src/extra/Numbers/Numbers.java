package extra.Numbers;

import java.util.Arrays;

public class Numbers {

    private double[] numbers;

    private Double mean;

    public Numbers(double... numbers) {
        this.numbers = numbers;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers(1, 4, 6, 4, 3, 2, 1);
        n.mean();
        System.out.println(n.getMean());
    }

    public void mean(){
        double m = 0.0;
        for(double d : numbers){
            m += d;
        }
        m/=numbers.length;
        mean = m;
    }

    public double variance(){
        if(mean==null){
            mean();
        }
        //variance stuff
        return 6.5;
    }

    public Double getMean() {
        return mean;
    }

}
