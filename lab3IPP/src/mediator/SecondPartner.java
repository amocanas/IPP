package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
public class SecondPartner extends Partner {
    public SecondPartner(Mediator mediator) {
        super(mediator);
        mediator.registerSecondPartner(this);
    }

    public String execute() {
        return "Second Partner";
    }
}
