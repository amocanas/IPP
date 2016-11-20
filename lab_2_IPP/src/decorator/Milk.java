package decorator;

/**
 * Created by Alina on 26/09/2016.
 */
public class Milk extends Decorator{

    public Milk(MenuItem _beverage){
        super(_beverage);
    }

    @Override
    public double cost(){
        return beverage.cost() + 7.4;
    }

    @Override
    public String description() {
        return beverage.description() + ", Milk";
    }
}
