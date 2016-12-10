package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
abstract class Partner {
    protected Mediator mediator;

    public Partner(Mediator mediator) {
        this.mediator = mediator;
    }
}
