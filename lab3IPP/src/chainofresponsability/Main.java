package chainofresponsability;

/**
 * Created by Alina on 12/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        // Create chain
        Chain chain = new NetworkLog();
        Chain second = new SystemLog();
        Chain third = new ApplicationLog();

        chain.setNext(second);
        second.setNext(third);

        chain.handleRequest(Chain.ERR_APPLICATION);
        chain.handleRequest(Chain.ERR_SYSTEM);
        chain.handleRequest(Chain.ERR_APPLICATION);
        chain.handleRequest(Chain.ERR_NETWORK);
    }
}
