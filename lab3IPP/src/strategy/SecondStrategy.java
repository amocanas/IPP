package strategy;

/**
 * Created by Alina on 12/10/2016.
 */
public class SecondStrategy extends Strategy {
    public String algorithm() {
        return doSomething() + " then " + doSomethingElse() + " and " + doSomethingDifferent();
    }

    private String doSomething() {
        return "Do something";
    }

    private String doSomethingElse() {
        return "Do something else";
    }

    private String doSomethingDifferent() {
        return "Do something different";
    }
}
