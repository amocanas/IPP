package FactoryMethod;

/**
 * Created by Alina on 10/22/2016.
 */
public class USDollar implements Currency {
    @Override
    public String getSymbol() {
        return "USD";
    }
}
