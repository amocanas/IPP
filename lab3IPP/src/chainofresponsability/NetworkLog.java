package chainofresponsability;

/**
 * Created by Alina on 12/10/2016.
 */
public class NetworkLog extends Chain {
    public NetworkLog() {
        super.priority = Chain.ERR_NETWORK;
    }

    public void writeMessage() {
        System.out.println("Network error logged");
    }
}
