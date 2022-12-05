package shapes_pack;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {
    final static private String DEFAULT_COLOR = "Red";
    final static private double DEFAULT_LONG_EDGE = 4.0;
    final static private double DEFAULT_SHORT_EDGE = 3.0;
    final static private int DEFAULT_X = 3;
    final static private int DEFAULT_Y = 4;

    public Rectangle(){
        this(DEFAULT_COLOR, new ArrayList<>(),new Point(DEFAULT_X,DEFAULT_Y));
        this.dimensions.add(DEFAULT_SHORT_EDGE);
        this.dimensions.add(DEFAULT_LONG_EDGE);
    }

    public Rectangle(String color, List<Double> dimensions, Point startingDrawPoint) {
        super(color, dimensions, startingDrawPoint);
    }


    @Override
    public void draw(){
        System.out.println("Rectangle{" +this);
    }
    @Override
    public void erase(){
        System.out.println("Rectangle.erase()");
    }

    @Override
    public String toString() {
        return super.toString() + " }";
    }
}
