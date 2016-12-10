package visitor;

/**
 * Created by Alina on 12/10/2016.
 */
abstract class Figure {
    public String name = "Figure";

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
