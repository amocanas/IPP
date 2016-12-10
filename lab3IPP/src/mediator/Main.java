package mediator;

/**
 * Created by Alina on 12/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        FirstPartner firstPartner = new FirstPartner(mediator);
        SecondPartner secondPartner = new SecondPartner(mediator);

        System.out.println(firstPartner.execute());
        System.out.println(secondPartner.execute());
    }
}
