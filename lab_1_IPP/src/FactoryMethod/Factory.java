package FactoryMethod;

/**
 * Created by Alina on 10/22/2016.
 */
public class Factory {
    public static void main(String args[]) {
        String country = "US";
        Currency symbol = CurrencyFactory.createCurrency(country);
        System.out.println(symbol.getSymbol());
    }
}
