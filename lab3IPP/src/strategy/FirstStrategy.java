package strategy;

/**
 * Created by Alina on 12/10/2016.
 */
public class FirstStrategy extends Strategy {
    public String algorithm() {
        return doSomething() + " then " + doSomethingElse();
    }

    private String doSomething() {
        return "Do something";
    }

    private String doSomethingElse() {
        return "Do something else";
    }
}
