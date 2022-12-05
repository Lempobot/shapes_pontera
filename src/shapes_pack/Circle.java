package shapes_pack;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Circle extends Shape {
    private Point centerCoordinates = new Point(); // Can be done with generics as well.

   public Circle(){
       this("Black", new ArrayList<Double>(4),new Point(0,0), new Point(0,0));
   }

    public Circle(String color, List<Double> dimensions, Point centerCoordinates, Point startingDrawPoint) {
        super(color, dimensions, startingDrawPoint);
        this.centerCoordinates = centerCoordinates;
    }

    public Point getCenterCoordinates() {
        return centerCoordinates;
    }

    public void setCenterCoordinates(Point centerCoordinates) {
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
