package decorator;

/**
 * Created by Alina on 26/09/2016.
 */
public class Espresso implements MenuItem {
    @Override
    public double cost() {
        return 18.0;
    }

    @Override
    public String description() {
        return "Espresso roast";
    }
}
