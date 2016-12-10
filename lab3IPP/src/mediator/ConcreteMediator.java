package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
public class ConcreteMediator implements Mediator{
    FirstPartner first;
    SecondPartner second;

    public void registerFirstPartner(FirstPartner partner) {
        first = partner;
    }

    public void registerSecondPartner(SecondPartner partner) {
        second = partner;
    }

    public String executeFirstPartner() {
        return first.execute();
    }

    public String executeSecondPartner() {
        return second.execute();
    }
}
