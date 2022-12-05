package shapes_pack;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Square extends Rectangle {
    final static private String DEFAULT_COLOR = "Blue";
    final static private double DEFAULT_EDGE = 5.0;
    final static private int DEFAULT_X = 6;
    final static private int DEFAULT_Y = 8;

    public Square() {
        this(DEFAULT_COLOR,new ArrayList<>(),new Point(DEFAULT_X,DEFAULT_Y));
        this.dimensions.add(DEFAULT_EDGE);
        this.dimensions.add(DEFAULT_EDGE);
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
