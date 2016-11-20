package decorator;

/**
 * Created by Alina on 26/09/2016.
 */
public class Mocha extends Decorator{

    public Mocha(MenuItem _beverage) {
        super(_beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }
}
