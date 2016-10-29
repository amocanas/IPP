package Builder;

/**
 * Created by Alina on 10/22/2016.
 */
public class SpicyPizzaBuilder extends PizzaBuilder{
    public void buildDough()   { pizza.setDough("pan baked"); }
    public void buildSauce()   { pizza.setSauce("hot"); }
    public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
}
