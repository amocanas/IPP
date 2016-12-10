package strategy;

/**
 * Created by Alina on 12/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Concrete firstAlg = new Concrete(new FirstStrategy());
        Concrete secondAlg = new Concrete(new SecondStrategy());

        System.out.println(firstAlg.algorithm());
        System.out.println(secondAlg.algorithm());
    }
}
