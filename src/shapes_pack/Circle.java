package shapes_pack;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {
    final static private String DEFAULT_COLOR = "Black";
    final static private double DEFAULT_RADIUS = 4.0;
    final static private int DEFAULT_X = 0;
    final static private int DEFAULT_Y = 0;
    private Point centerCoordinates; // Can be done with generics as well.

   public Circle(){
       this(DEFAULT_COLOR, new ArrayList<>((int) DEFAULT_RADIUS),new Point(DEFAULT_X,DEFAULT_Y), new Point(DEFAULT_X,DEFAULT_Y));
   }

    public Circle(String color, List<Double> dimensions, Point centerCoordinates, Point startingDrawPoint) {
        super(color, dimensions, startingDrawPoint);
        this.centerCoordinates = centerCoordinates;
    }

    @Override
    public void draw(){
       System.out.println("Circle{" + this);
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }

    @Override
    public String toString() {
        return
                "centerCoordinates=" + centerCoordinates.getX() + "," + centerCoordinates.getY() +
                super.toString() + " }";
    }
}
