package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
public class FirstPartner extends Partner {
    public FirstPartner(Mediator mediator) {
        super(mediator);
        mediator.registerFirstPartner(this);
    }

    public String execute() {
        return "First Partner";
    }
}
