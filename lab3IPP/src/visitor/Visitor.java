package visitor;

/**
 * Created by Alina on 12/10/2016.
 */
abstract class Visitor {
    public String visit(Figure figure) {
        return figure.name;
    };

    abstract String visit(Square figure);

    abstract String visit(Circle figure);
}
