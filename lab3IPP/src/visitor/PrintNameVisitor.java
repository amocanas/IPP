package visitor;

/**
 * Created by Alina on 12/10/2016.
 */
public class PrintNameVisitor extends Visitor {
    public String visit(Circle figure) {
        return figure.name;
    }

    public String visit(Square figure) {
        return figure.name;
    }
}
