import shapes_pack.*;

import java.util.Random;

public class Main {

    private static ShapesFactory shapeFactory = new ShapesFactory();
    public static void main(String[] args) {

        Shape[] arrayOfShapes = new Shape[9];
        for(int i = 0; i < arrayOfShapes.length; i++){
            arrayOfShapes[i] = shapeFactory.nextShape();
        }

        for(Shape shape: arrayOfShapes){
            shape.draw();
            shape.erase();
        }
    }
}