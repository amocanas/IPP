package Builder;

/**
 * Created by Alina on 10/22/2016.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder{
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}
