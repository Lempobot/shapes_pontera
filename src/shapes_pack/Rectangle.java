package shapes_pack;

import shapes_pack.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {

    public Rectangle(){
        this("Red", new ArrayList<Double>(),new Point(3,4));
        this.dimensions.add(3.0);
        this.dimensions.add(4.0);
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
