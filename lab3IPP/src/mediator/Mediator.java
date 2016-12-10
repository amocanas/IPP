package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
public interface Mediator {
    void registerFirstPartner(FirstPartner partner);
    void registerSecondPartner(SecondPartner partner);
    String executeFirstPartner();
    String executeSecondPartner();
}
