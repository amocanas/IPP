package decorator;

/**
 * Created by Alina on 26/09/2016.
 */
public class main {
    public static void main(String[] args) {

        // Order hot chocolate
        MenuItem beverage = new HotChocolate();

        // add mocha flavor to it
        beverage = new Mocha(beverage);

        // get invoice
        System.out.println("Your Order: " + beverage.description());
        System.out.println("Total Cost: " + beverage.cost());

    }
}
