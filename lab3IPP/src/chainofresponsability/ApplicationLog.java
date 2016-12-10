package chainofresponsability;

/**
 * Created by Alina on 12/10/2016.
 */
public class ApplicationLog extends Chain {
    public ApplicationLog() {
        super.priority = Chain.ERR_APPLICATION;
    }

    public void writeMessage() {
        System.out.println("Application error logged");
    }
}
