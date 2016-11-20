package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alina on 26/09/2016.
 */
public class Picture implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();
    private String name;

    public Picture(String _name){
        name = _name;
    }

    @Override
    public void draw(){
        System.out.println("Start Drawing Picture: " + name);
        for(Shape shape: shapes){
            shape.draw();
        }
        System.out.println("Finished Drawing Picture: " + name);
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

}
