package iterator;

/**
 * Created by Alina on 12/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompound compound = new ConcreteCompound("Iterator Design Pattern");
        Iterator iterator = compound.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
