package iterator;

/**
 * Created by Alina on 12/10/2016.
 */
abstract class Iterator {
    abstract String current();
    abstract boolean hasNext();
    abstract String first();
    abstract String last();
    abstract String next();
    abstract String previous();
}
