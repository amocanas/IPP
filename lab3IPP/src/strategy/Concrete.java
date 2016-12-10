package strategy;

/**
 * Created by Alina on 12/10/2016.
 */
public class Concrete {
    protected Strategy strategy;

    public Concrete(Strategy strategy) {
        this.strategy = strategy;
    }

    public String algorithm() {
        return strategy.algorithm();
    }
}
