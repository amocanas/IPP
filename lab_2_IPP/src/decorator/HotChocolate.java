package decorator;

/**
 * Created by Alina on 26/09/2016.
 */
public class HotChocolate implements MenuItem{
    @Override
    public double cost() {
        return 20.5;
    }

    @Override
    public String description() {
        return "Hot Chocolate";
    }
}
