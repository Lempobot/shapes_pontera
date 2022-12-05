package shapes_pack;

import java.awt.*;
import java.util.List;

public abstract class Shape {
    protected String color;
    protected List<Double> dimensions;
    protected Point startingDrawPoint;

    public Shape(String color, List<Double> dimensions, Point startingDrawPoint) {
        this.color = color;
        this.dimensions = dimensions;
        this.startingDrawPoint = startingDrawPoint;
    }

    public abstract void draw();
    public abstract void erase();

    @Override
    public String toString() {
        return
                " color='" + color + '\'' +
                ", dimensions=" + dimensions +
                ", startingDrawPoint=" + startingDrawPoint.getX() + "," + startingDrawPoint.getY();
    }
}
