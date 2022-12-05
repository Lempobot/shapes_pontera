package shapes_pack;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Square extends Rectangle {

    public Square() {
        this("Blue",new ArrayList<Double>(),new Point(6,8));
        this.dimensions.add(5.0);
        this.dimensions.add(5.0);
    }

    public Square(String color, List<Double> dimensions, Point startingDrawPoint) {
        super(color, dimensions, startingDrawPoint);
    }

    @Override
    public void draw(){
        System.out.println("Square{"+this);
    }

    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }

    @Override
    public String toString() {
        return super.toString() + " }";
    }
}
