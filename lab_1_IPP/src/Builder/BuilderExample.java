package Builder;

/**
 * Created by Alina on 10/22/2016.
 */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder(hawaiian_pizzabuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
