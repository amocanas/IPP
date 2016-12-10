package iterator;

/**
 * Created by Alina on 12/10/2016.
 */
public class ConcreteCompound extends Compound{
    public String word;

    public ConcreteCompound(String word) {
        this.word = word;
    }

    public Iterator getIterator() {
        return new ConcreteIterator(word);
    }
}
